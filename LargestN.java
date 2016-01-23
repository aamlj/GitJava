// Author: Mike Jones

// Program Description: gives the largest number squared is less than 12000.



import java.util.Scanner;

public class LargestN
{
   public static void main(String[] args)

  {

      int n=1;

 

      while (Math.pow(n+1 , 2) < 12000)

      {

         n++;

      }


      int large =  n;
 
      System.out.println("Largest number = " + large);

   }

}

   

