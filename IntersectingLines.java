//Author: mike Jones
// A program that prompts the user to enter four endpoints and displays the intersecting point. 
// If the line segments don't intersect, display that they do not intersect. 

import java.util.Scanner;

public class IntersectingLines{

   public static void main (String[]args){
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");// prompt user for input
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      double x4 = input.nextDouble();
      double y4 = input.nextDouble();
      
      
      double a = y1 - y2;
      double b = -x1 + x2;
      double c = y3 - y4;
      double d = -x3 + x4;
      double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
      double f = -y3 * (x3 - x4) + (y3 - y4) * x3;
   
      LinearEquation L1 = new LinearEquation(a,b,c,d,e,f);//linearEquation class
     
      double answer = L1.getX()-L1.getY();
   
   
   
   }

}