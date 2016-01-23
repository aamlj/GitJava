//Author: Mike Jones
// a class named LinearEquation for a 2x2 system of linear equations

public class LinearEquation{


   private  double a;

   private  double b;

   private  double c;

   private  double d;

   private  double e;

   private  double f;
   
   private double x;
   
   private double y;
  
  
  
   public LinearEquation(double a1, double b1,double c1, double d1, double e1, double f1) {//make these varibles different for me
       a = a1;
       b = b1;
       c = c1;
       d = d1;
       e = e1;
       f = f1;
   
      if (isSolvable()==true)// conditional
      
         System.out.println("x is " + getX() + " and " + "y is " + getY());
      
      else
      
         System.out.println("The equation has no solution");
   }
   
   public boolean isSolvable() {//boolean method
   
      if ((a * d) - (b * c) == 0){ 
      
         return false;
      }
   
      return true;
   }

   public  double getX() {
   
      x = (e * d - b * f) / (a * d - b * c);//method for x
   
      return x;
   
   }

   public  double getY() {
   
      y = (a * f - e * c) / (a * d - b * c);//method for y
   
      return y;
   
   }

   public double getA() {// a getter for a
   
      return a;
   }

   public double getB() {// a getter for b
   
      return b;
   }   
   
   public double getC() {// a getter for c
   
      return c;
   }

   public double getD() {// a getter for d
   
      return d;
   }

   public double getE() {// a getter for e
   
      return e;
   }

   public double getF() {// a getter for f
   
      return f;
   
   }
}

  
  
  
  
  
  
   
   
   
