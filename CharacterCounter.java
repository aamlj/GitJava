//Author:  Mike Jones
// A unique program that displays the unique characters in a sentence, and tallys them.


import java.util.Scanner;

public class CharacterCounter{
   public static void main (String [] args){
           
            
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Your Sentence Here: ");// input from user
      String text = input.nextLine( );
   
      displayUniqueCharacterCount(text);// call my function
   
   
   }         




   public static void  displayUniqueCharacterCount( String text ) {
          
      String[] x = new String[Character.MAX_VALUE];// in the textbook
       
      int length = text.length();
      int count = 0;
      for (int i = 0; i < length; i++) {
         String letter = text.substring (0,1);   
         if (java.util.Arrays.asList(x).indexOf(letter) == -1 ){//found in the java docs
            x[count] = letter;
            count++;
         }
         text = text.substring(1,text.length());
      }
      for (int i = 0;i < x.length; i++){
         if (x[i] != null)  
            System.out.print(x[i]);// print out the characters not repeated
      }   
      
      System.out.println("\n Number of unique characters: " + count); // print out the number of characters not repeated.
   }
   
}  
   
   

      

