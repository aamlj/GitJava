// Author: Mike Jones

// Program Description: When two numbers are given displays lowest, greatest, or equal.

import java.util.Scanner;

public class LargerNumber{

   public static void main ( String[] args){
   
   Scanner input = new Scanner (System.in);
   
   System.out.print ("Enter your first number: ");
   
   double first = input.nextDouble();//first input by user
   
   System.out.print ("Enter your second number: ");
   
   double second = input.nextDouble();//second input by user
   
   if (first > second){//first condition
   
   System.out.print ("The first number is the Largest");//result of first condition
   
   }else if (first < second){//second condition
   
   System.out.print ("The second number is the largest");//result of second condition
   
   }else if (first == second){//third condition
   
   System.out.print ("The numbers are equal");  }//result of third condition
   
   }
   }
   
   
   
   
   
   
   
   
