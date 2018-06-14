
public static void main(String[] args) {

      // get all 2-letter country codes
      String countries[] = Locale.getISOCountries();

      // print countries
      int i = 1;
      for (String country : countries) {
         System.out.print(country);
         if(i++ % 15 == 0){
            System.out.println();
         } else {
            System.out.print(" ");
         }
      }

   }
}


