// Author: Mike Jones

// Program Description: Displays a table converting miles to kilometers

import java.util.Scanner;

public class MilesToKilo
{
   public static void main(String[] args)
   {
      // enter input to determine how big table is; in our case number 10.
      Scanner input = new Scanner(System.in);
      
         System.out.print("Enter a number: ");
        
         // create varibles
         int x = input.nextInt();
         
         int m = 1;
         
         int k = 1609;
         
         // make the top of table
         
         System.out.println("Miles to kilometer table");
         
         System.out.println("-----------------------------");
         
         System.out.println("MILES" + "\t" +"\t"+ "KILOMETERS");
         
         //make first column
         for( m = 1; m <= x; m++)
         {
         
         //Print first column
         
         
         System.out.print( m + "\t"+"\t");
            
            //make second column
            for (  k = 1609; k <= x; k++);
            {  
            //Print second column
            System.out.print( ( m * k ) + "\t"+"\t");
            }  
            
            // put correct spacing
            System.out.println("");
      }
   }
}