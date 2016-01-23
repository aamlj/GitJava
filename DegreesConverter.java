//author:  Mike Jones

// program will display conversion of fahrenheit to celsius and celsius to fahrenhiet 1 to 100.

//import java.util.Scanner;

   public class DegreesConverter{

      
      /* method created to convert celsius to fahrenhiet*/
      public static double c2f(double celsius){ //create method to convert celsius to fahrenheit
      
         return  (9.0 / 5) * celsius + 32;  } //return value using formula for conversion

       /* method created to convert fahrenhiet to celsius*/
       public static double f2c(double fahrenheit){ //create method to convert fahrenheit to celcius
      
         return (5.0 / 9) * (fahrenheit - 32); } // return value using formula for conversion


   public static void main(String[] args){

System.out.println("Celsius\t\tFahrenheit\t\tFahrenheit\t Celsius"); // build the header

System.out.println("================================================================"); //underscore of header

for (int x = 0; x <= 100; x++){// create loop so program runs 100 times for c2f

System.out.printf("\n %d\t\t%.2f\t\t\t %d\t\t%.2f", x,(c2f(x)),x, f2c(x)); //print output

}

}
      
}           

