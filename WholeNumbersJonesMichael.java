/**
    Design a program that reads in some N from the user and then displays the sum 
    of all positive numbers from 1 to N.

    
    @author Mike Jones< mljones699@mail.cfcc.edu >
    @date   1/15/2015
 */

import java.util.Scanner;

public class WholeNumbersJonesMichael{
   
   public static void main (String [] args){
   
      Scanner input = new Scanner(System.in);
      //prompt user input
      System.out.println("Enter a value for n: ");
      //set this to long because we dont know how large the number is.
      long n = input.nextLong();
      
      System.out.println("The sum of all positive numbers from 1 to "+ n + " is "+ (n*(n+1.0)/2.0));
   
   
   }
}





