
import java.io.File;

public class Example {

   public static void main(String[] args) {
      File mydir = new File("/tmp/mydir");
      boolean success = deleteDir(mydir);
      if (success) {
         System.out.println("success");
      }
   }

   public static boolean deleteDir(File dir) {
      if (dir.isDirectory()) {
         String[] children = dir.list();
         for (String children1 : children) {
            boolean success = deleteDir(new File(dir, children1));
            if (!success) {
               return false;
            }
         }
      }      
      return dir.delete();
   }
}




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
   
 

 


  
  







