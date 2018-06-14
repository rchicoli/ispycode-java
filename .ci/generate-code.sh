#!/bin/bash

basedir="/tmp/java"

for filename in $(find $HOME/ispycode.com/Java -type f); do

    newname=$(echo ${filename##*/} | sed 's/.html/.java/');

    foldername="$(echo ${filename%/*} | sed 's,$HOME/ispycode.com/Java,,g')"
    if ! test -d "$basedir/$foldername"; then
        mkdir -p "$basedir/$foldername"
    fi

    cat "$filename" |\
        sed -e 's/<[^>]\+>//g' "$filename" |\
        sed -n '/Source:/,/Output:/p' |\
        sed 's/\&nbsp;//g'         |\
        sed 's/\&quot;/\"/g'       |\
        sed 's/\&lt;/\</g'         |\
        sed 's/\&amp;/\&/g'        |\
        sed 's/\&gt;/\>/g'         |\
        sed 's/\&#40;/(/g'         |\
        sed 's/\&#41;/)/g'         |\
        sed 's/\&#91;/[/g'         |\
        sed 's/\&#93;/]/g'         |\
        sed 's/&#123;/{/g'         |\
        sed 's/&#125;/}/g'         |\
        grep -vE "Output:|Source:"  \
            > "$basedir/$foldername/$newname"

        if [[ $(stat --printf=%s  "$basedir/$foldername/$newname") -eq 0 ]]; then
            rm "$basedir/$foldername/$newname"
        fi
done