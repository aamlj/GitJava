// Author: Mike Jones

// Program Description: If either the inputs are 42 or the +,-,*, or / of two inputs equal
//                      42 then it is a awesome number.  If not it is not a good number

import java.util.Scanner;

public class TheGreatNumber{

   public static void main ( String[] args){
   
   Scanner input = new Scanner (System.in);

   System.out.print ("Enter your first number: ");
   
   int a = input.nextInt();//first input by user
   
   System.out.print ("Enter your second number: ");
   
   int b = input.nextInt();//second input by user
   
      if (a==42){ //first condition 
   
      System.out.print ("That is one awesome number!");
             
       } else if (b==42) { //second condition
       
      System.out.print ("That is one awesome number!");

       } else if (a + b == 42) { //third condition

       System.out.print ("That is one awesome number!");

      } else if (a - b == 42) { //fourth condition

      System.out.print ("That is one awesome number!");

       } else if (a * b == 42) { //fifth condition

      System.out.print ("That is one awesome number!");

      } else if (a / b == 42) { //sixth condition 

      System.out.print ("That is one awesome number!");
      
      }else{ //default 
      
      System.out.print ("That number is not so great");








}
}
}