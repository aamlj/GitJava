//Author: Mike Jones
//  Test program that utilizes the LinearEquation class created.
import java.util.Scanner;

public class TestLinearEquation{
   
   public static void main (String[]args){
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a,b,c,d,e,f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble();
      LinearEquation L1 = new LinearEquation(a,b,c,d,e,f);
      double answer = L1.getX()-L1.getY();
   }


}