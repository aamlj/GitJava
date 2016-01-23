//Author: Mike Jones
// this program will display the spanish tranlation of the items in menu depending on users selection



import java.util.Scanner;
 
 
public class EnglishToSpanish {
 
   public static void main (String []args){
   
      boolean validInput = false;
         
      String text1 = ("where is the bathroom"); 
   
      String text2 = ("what time is it");
   
      String text3 = ("that was an evil bunny");
   
      String text4 = ("quit");
   
      Scanner input = new Scanner(System.in);
   
      while (validInput==false) {//boolean with a while loop to validate user input
         System.out.println("Please type in your phrase: \n");
         System.out.println("Where is the bathroom");
         System.out.println ("What time is it");
         System.out.println ("That was an evil bunny");
         System.out.println  ("quit");
         String text = input.nextLine( );
         text = text.toUpperCase();  // makes all the input uppercase so it will be equal
           
          
         if (text.equals(text1.toUpperCase())){
                   
            System.out.print ("Donde esta el bano means " + text1 + " in English");
             
         }
         
         if     (text.equals(text2.toUpperCase())){
                   
            System.out.print ("Que hora es means " + text2 + " in English");
             
         }
            
         if    (text.equals(text3.toUpperCase())) {
                   
            System.out.print ("Era un conejo malo means " + text3 + " in English");
         }
            
         if     (text.equals(text4.toUpperCase())) {
                   
            System.out.print ("See you next time!");
             
         }
      
         if  ((text.equals(text1.toUpperCase()))||(text.equals(text2.toUpperCase()))||
                      (text.equals(text3.toUpperCase()))||(text.equals(text4.toUpperCase()))) {
            validInput = true;      // if false will loop until a valid selection
         }
         else {
            System.out.print ("Invalid Selection! \n");        
         }
      }
   }
}
