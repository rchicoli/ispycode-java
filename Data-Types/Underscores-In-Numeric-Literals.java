
public class UnderscoreInNumbers {

   public static void main(String[] args) {

      long creditCardNumber = 1234_5678_9012_3456L;
      long socialSecurityNumber = 999_99_9999L;
      float pi =        3.14_15F;
      long hexBytes = 0xFF_EC_DE_5E;
      long hexWords = 0xCAFE_BABE;
      long maxLong = 0x7fff_ffff_ffff_ffffL;
      byte nybbles = 0b0010_0101;
      long bytes = 0b11010010_01101001_10010100_10010010;

      System.out.println("creditCardNumber: " + creditCardNumber);
      System.out.println("socialSecurityNumber: " + socialSecurityNumber);
      System.out.println("pi: " + pi);
      System.out.println("hexBytes: " + hexBytes);
      System.out.println("hexWords: " + hexWords);
      System.out.println("maxLong: " + maxLong);
      System.out.println("nybbles: " + nybbles);
      System.out.println("bytes: " + bytes);
   }
}


Output

$ java UnderscoreInNumbers
creditCardNumber: 1234567890123456
socialSecurityNumber: 999999999
pi: 3.1415
hexBytes: -1253794
hexWords: -889275714
maxLong: 9223372036854775807
nybbles: 37
bytes: -764832622


Questions answered by this page:Java 7 underscore in numeric literals
How to use Numeric literal with underscore in java



<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="4835580402"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});



   
 


  
    Related ExamplesBooleanByteCharDefault ValuesDoubleFloatIntLongShortUnderscores In Numeric Literals


<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4058794840952844"
     data-ad-slot="1144086401"
     data-ad-format="auto">

(adsbygoogle = window.adsbygoogle || []).push({});


10
   
 

 


  
  







