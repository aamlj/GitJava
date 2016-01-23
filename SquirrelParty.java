// Author: Mike Jones

// Program Description: Tells user if it is a good or dull party based on is it the week
//                      end and how many cigars there are

import javax.swing.JOptionPane;

import java.util.Scanner;

public class SquirrelParty{

   public static void main ( String[] args){
   
   Scanner input = new Scanner (System.in);
   
   
   System.out.print ("Enter number of cigars: ");//prompt user
 
   int c = input.nextInt();//user input
    
   int x =  JOptionPane.showConfirmDialog(null, "Is it the weekend?");//create dialog box
      
      if (x==JOptionPane.YES_OPTION && c<=40){//first condition

      System.out.print ("That ain't no party! ");//output
        
      }else if  (c <=60 || c >=40){ //second condition
        
      System.out.print (" now THAT'S a party! ");//output
        
      } else if (x==JOptionPane.NO_OPTION && c <=40){//third condition
      
      System.out.print ("That ain't no party!");//output

     
       

 
    
 
 }
 }
}
    
    
    
    
    
    
    
    
    
    
    
