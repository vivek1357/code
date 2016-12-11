public class StringDemo{
	  static char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
      static String helloString = new String(helloArray);
      static String worldString = " World!!  ";
      static Double doubleVar = 36.34;  

   public static void main(String args[]){

      System.out.println( helloString + worldString + Double.toString(doubleVar));

      Double doubleVar = 44.25;  
      System.out.println( helloString + worldString + Double.toString(doubleVar));
      
      myMethod();
  	}
      
   public static void myMethod()
   {
      	Double doubleVar = 77.36;
        System.out.println( helloString + worldString + Double.toString(doubleVar));
   }
}