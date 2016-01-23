// //Author: Mike Jones

// //Program Description:  program that simulates flipping a coin one million times and displays the number of heads and tails

 
 import java.util.Scanner;




public class HeadsOrTails

{
   public static void main(String[] args)
   {
   
      int numTimesOnHead = 0;
      int numTimesOnTail = 0;
      int loopCounter = 1;
      double flipHeadsOrTails = 0;

      while (loopCounter <= 1000000)   //Continue executing the code within the while loop 1 million times.
      {
         flipHeadsOrTails = Math.random();   //Get a random number of the coin landing on heads or tails.  If the value is < .5, then tails, otherwise heads.

         if (flipHeadsOrTails < .5)   //Since .5 is halfway between 0 and 1
         {
            numTimesOnTail++;   //Increment the number of times the coin landed on tails.
         }
         else
         {
            numTimesOnHead++;   //Increment the number of times the simulated coin flip landed on heads.
         }

         loopCounter++;  //Increment the loop counter variable                                  
      }

      System.out.println("The coin landed on tails " + numTimesOnTail + " times and on heads " + numTimesOnHead + " times.");


   }

}



 
  
    


    






 







 
