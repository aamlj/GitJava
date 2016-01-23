/**
   Author:  Michael Jones
   Date:    01/21/2015
   Section: CSC251, Section N01, Spring 2015
*/


import java.util.Scanner;

public class PointInCircleJonesMichael{

   public static void main (String[]args){
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x and y points: ");// prompt user for input
      double x = input.nextDouble();
      double y = input.nextDouble();
      double x2 = 0;
      double y2 = 0;
      double r = 10;//create varible to hold constant value for r
      double answer;//create varible to hold formula for distance
      answer = Math.sqrt(Math.pow(x2-x,2) + Math.pow(y2-y,2));//implement Math.sqrt and Math.pow of the math class
                           
      if (answer < r){//conditional where it is two posibilities
         System.out.println("Points (" + x + " and " +  y + " ) are in the circle");
      }
      else{
         System.out.println("Poinst (" + x +  " and " + y + ") are not in the circle");
      }
   }
}