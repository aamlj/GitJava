//Author: Mike Jones
//a program that creates a Date object and calls it ten times 

import java.util.Date;


public class ImportantDates{
   public static void main (String[] args){
   
      Date date = new Date();
      System.out.println(date);
      long x = 10000L;
      for (int i = 0;i < 9;i++)//loop that goes 9 times 
      {
         date.setTime(x);
         System.out.println(date);  
         x = x * 10;
      }
   
    
   
   
   
   
   
   
   
   
   
   
   }
   


}