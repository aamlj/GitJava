// Author: Mike Jones

// Program Description: when the alarm clock goes off given day of week

import java.util.Scanner;

public class AlarmClock{

   public static void main ( String[] args){
   
   Scanner input= new Scanner (System.in);
   
   //days of the week entered 0-6
   
   System.out.print ("Enter day of week: ");
   
   double day = input.nextDouble();//input day of week
   
      if (day == 0){ // if input day is 0 this is output.
   
         System.out.print ("Alarm will go off at 10:00 a.m. ");
   
     }else if (day == 6){ //if input day is 6 this is output.
   
         System.out.println ("Alarm will go off at 10:00 a.m. ");
   
     }else{ //otherwise this will be the output
  
         System.out.println ("Alarm will go off at 6:00 a.m. ");

 
 
 
 
 
 
 
} 
}
}