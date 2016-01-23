//Author: Mike Jones
// creates a Rectangle class with area and perimeter constructors


public class Rectangle{

   double width;

   double height;

   public Rectangle(){
   
      width = 1;
   
      height = 1;
   }
   public Rectangle(double w,double h){
   
      width = w;
   
      height = h;
   }
   public double getArea(){
   
      double area = width * height;
   
      return area;
   }
   public double getPerimeter(){
   
      double perimeter = (2 * width) + (2 * height);
   
      return perimeter;
   }
}