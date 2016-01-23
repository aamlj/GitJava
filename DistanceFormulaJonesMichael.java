/**
   Author:  Michael Jones
   Date:    01/21/2015
   Section: CSC251, Section N01, Spring 2015
*/


import java.util.Scanner;

public class DistanceFormulaJonesMichael{

   public static void main (String[]args){
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1, y1, x2, y2: ");// prompt user for input
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      double answer;//create variable to hold formula for distance
      
      answer = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));//implement Math.sqrt and Math.pow of the math class
      
      System.out.println("The distance between these points is: " + answer);
   
   }
}