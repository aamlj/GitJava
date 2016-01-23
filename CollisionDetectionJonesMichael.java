/**
   Author:  Michael Jones
   Date:    01/22/2015
   Section: CSC251, Section N01, Spring 2015
*/


import java.util.Scanner;

public class CollisionDetectionJonesMichael{

   public static void main (String[]args){
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first x and y points for the line: ");//user input for line
      double x = input.nextDouble();
      double y = input.nextDouble();
      System.out.print("Enter second x and y points for line: ");//user input for line
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      System.out.print("Enter x and y points for character: ");//user input for character
      double characterX = input.nextDouble();
      double characterY = input.nextDouble();
      double wall= Math.sqrt(Math.pow(x2-x,2) + Math.pow(y2-y,2));//find the distance of the "wall"
      double distanceA;
      distanceA = Math.sqrt(Math.pow(characterX-x,2) + Math.pow(characterY-y,2));//find the distance to the first coordinates
      double distanceB;
      distanceB = Math.sqrt(Math.pow(characterX-x2,2) + Math.pow(characterY-y2,2));//find the distance to the second coordinate
      double totalDistance;
      totalDistance = distanceA + distanceB;//add the two together
	   if (totalDistance ==wall){//conditional to determine collision
		  System.out.println("Collision detected! ");
	  }else{
		System.out.println("No collision detected! ");  
	  }
   }
}
