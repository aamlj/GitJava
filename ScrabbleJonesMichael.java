/**
   Author:  Michael Jones
   Date:    01/29/2015
   Section: CSC251, Section N01, Spring 2015
*/

import java.util.Scanner;

public class ScrabbleJonesMichael{
   
   public static void main(String[]args){
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter your word: ");//prompt user
      String word = input.nextLine();
      
	  int score = scrabbleCalc(word);

      System.out.println("Your score is "+ score);
   //System.out.println("Expected: 70");
   }
   
   /**
   *this method creates a total for the value of all characters in word
   *@param is a string
   *return type is an int**/
   
   
   public static int scrabbleCalc(String word){
      int total = 0;         
      word = word.toLowerCase();//make all input lowercase
      for(int i = 0; i < word.length();i++ ){
      
         char wordchar = word.charAt(i);
      
        
      
         switch(wordchar){//switch statement for all letters
                
            case 'a': 
			case 'i': 
			case 'n': 
			case 'l': 
			case 'e':
			case 'o': 
			case 'r':  
			case 's': 
			case 't': 
			case 'u':
			   total += 1;
               break;			
			case 'd': 
			case 'g':
               total +=2;
               break;
            case 'b': 
			case 'c': 
			case 'm': 
			case 'p':
               total +=3;
               break;
            case 'f': 
			case 'h': 
			case 'v': 
			case 'w': 
			case 'y':
               total +=4;
               break;
            case 'k': 
			   total +=5;
               break;
			case 'j':
				total +=8;
				break;
			case 'q':
			case 'z':
				total +=10;
				break;
		 }
                              
                         
      }
         return total;                
  
                         
   
                                              
   
   }

                
                
                
                
                
                
                
                
                
                
                 
}