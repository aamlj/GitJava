/**
   Author:  Michael Jones
   Date:    01/29/2015
   Section: CSC251, Section N01, Spring 2015
*/

public class FractionsJonesMichael{

   public static void main(String[]args){
     System.out.println (sumOfFractions(1));
        
        
   }
   /**this method creates a numerator and denominator and adds the fraction 
   *@param is an integer
   *@return a double sum
   **/
   
   
   public static double sumOfFractions(int number){ 
      double numerator = 1;
      double denominator = 0;
      double sum = 0;
      for (int i = 0; i < number; i++){
         denominator = number - i;
        
         sum += numerator/denominator;  
         numerator++;
      }
      return sum;
   }
}