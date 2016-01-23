/**
    This will correct poor coding.
    
    @author Mike Jones< mljones699@mail.cfcc.edu >
    @date   1/15/2015
 */


import java.util.Scanner;

public class ConverterJonesMichael {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      //prompt for user input
      double celsius = input.nextDouble();
      //apply the formula for converting celsius to farenhiet
      double farenhiet = ((9.0/5.0)*celsius) + 32;
      
      System.out.println(farenhiet);
   }
}