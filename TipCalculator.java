import java.util.Scanner;

public class TipCalculator{

   public static void main (String [] args){
   
   //tip= subtotal * gratuity rate
   // total= subtotal+tip
   
   Scanner input = new Scanner (System.in);
   
   double t, total, gratuity, subtotal;
   
    //tip, total, subtotal, gratuity
   
      System.out.print("Subtotal: ");
      
      subtotal = input.nextDouble();
      
      System.out.print ("Gratuity Rate: ");
      
      gratuity = input.nextDouble();
      
      t = subtotal * gratuity;
      
      total = subtotal + t;
      
      System.out.println ("The gratuity is $" + t + 
                          " and " +
                          "the total is $ " + total);
                          }
                          }
                                                                                                                                  