//Author: Mike Jones
// A program that displays the first 50 random integers between 0 and 100 using the nextInt(100) method.

import java.util.Random;

public class RandomObjects
{
   public static void main(String[] args)
  {
   
  
   Random random=new Random(1000);
   int randomInt = random.nextInt(100);
    for ( int i=0; i<=50; i++ )
   {
      System.out.println(random.nextInt(100));  
    }     
         
         
  }
}