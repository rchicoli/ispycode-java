import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        String dir = Paths.get(".").toAbsolutePath().normalize().toString();
        System.out.println("Dir:" + dir);
    }
}


Output

$ java Example
Dir: /Users/bob/NetBeansProjects/myProject



Questions answered by this page:How to get the current working in java?
How to find current directory in Java with an example?
java example that prints the name of current/working directory
java PWD program



<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="4835580402"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});



   
 


  
    Related ExamplesAvailable disk spaceBasicFileAttributesCreate a directoryCurrent Working DirectoryDelete a directory not emptyDelete a fileFile last modifiedFile sizeFileSystemUtilsList files in a directoryMake file readonlyRename a fileTest if file existsTest if file is hidden


<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="1144086401"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});


14
   
 

 


  
  







