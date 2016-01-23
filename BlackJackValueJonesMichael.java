/**
Author:  Michael Jones
Date:    01/29/2015
Section: CSC251, Section N01, Spring 2015
*/
import java.util.Arrays;//import to manipulate the array

public class BlackJackValueJonesMichael {
   
   public static void main(String[] args) {
   	
      String hand[] ={"AD","AC", "AH", "AS", "AS"};//test case
      int total = blackjackValue(hand);
     
      System.out.println(total);
   }
/**this method gives a numeric value for a blackjack hand and changes the A value accordingly 
   *@param is a String[]
   *@return an int
   **/

   public static int blackjackValue(String hand []){
      int totalAce = 0;
      int total=0;
      String card = Arrays.toString(hand); //change my array to a string   
      for(int i=0; i <( card.length() - 1); i++)// loop through string
          	
         switch(card.charAt(i)){//find al occurences of the said char
            case '1':
               total+=10;
               break;
            case '2':
               total+=2;
               break;
            case '3':
               total+=2;
               break;
            case '4':
               total+=4;
               break;
            case '5':
               total+=5;
               break;
            case '6':
               total+=6;
               break;
            case '7':
               total+=7;
               break;
            case '8':
               total+=8;
               break;
            case '9':
               total+=9;
               break;
            case 'A':
               total+=11;
               totalAce++;
               break; 
            case 'K':
               total+=10;
               break;
            case 'Q':
               total+=10;
               break;
            case 'J':
               total+=10;
               break;
         }
      while (total > 21 && totalAce!=0 && totalAce < 4){//applies the value of 11 0r 1 and subtracts each ace when changed
         totalAce-=1;
         total-=10;
         
                    
      }
        if(totalAce>4 && total > 21){//if no aces then they just bust
           // total = total;
         System.out.println("Too Badd!!!!!!!!!");
         
         }

      return total;	 
   }     
        
}

   
		
		
