//Author: Mike Jones
// program that creates two Rectangle ojects and display the width, height, area, and perimeter of each rectangle.



public class TestRectangle{
   
   public static void main(String[] args){
    
      Rectangle r1 = new Rectangle(4,40);// uses the rectangle object
    
      Rectangle r2 = new Rectangle(3.5,35.9);// uses the rectangle object
       
       System.out.println("The first rectangle has "+ r1.width +" for width and " + 
       r1.height + " for height " + r1.getArea() + " for area and " + r1.getPerimeter() + " for perimeter " );
       
       System.out.printf("The second rectangle has "+ r2.width +" for width and " + 
       r2.height + " for height " + r2.getArea() + " for area and " + r2.getPerimeter() + " for perimeter " );
       
  
    
   }



}