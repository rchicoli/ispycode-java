public class Example {

   public static void main(String a[]){

      String str = "the cat in the hat";
      System.out.println(str);

      String str1 = str.replaceFirst("the", "FOO");
      System.out.println(str1);

      String str2 = str.replace("the","FOO");
      System.out.println(str2);

   }
}


