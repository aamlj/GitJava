//Author: Mike Jones
/*This program will display how many of 100 locker doors will be open or closed after 100 students 
open and close them*/
public class LockerPuzzle{


   public static void main(String[] args) {
   
      
      int size = 100;
      boolean []open = new boolean[size];       //For each pass through the lockers (1 to 100) toggle (meaning if closed,
      //then open; if opened, then close) the locker that is an even multiple of the pass.
      for (int pass = 1; pass <= 100; pass++) {
         for (int locker = 1; locker <= 100; locker++) {
            if (locker % pass == 0)  // if the locker is an even multiple of the pass.
               open[locker - 1] = !open[locker - 1]; //Toggle the locker.
         }
      }
     
      for (int locker = 0; locker < 100; locker++) {
         System.out.print((open[locker]) ? "O":"C");
         
         if ((locker + 1) % 10 == 0)
            System.out.printf("\n");
      }
   }
}                
