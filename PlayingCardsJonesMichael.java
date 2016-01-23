/**
   Author:  Michael Jones
   Date:    01/21/2015
   Section: CSC251, Section N01, Spring 2015
*/

import java.util.Scanner;

public class PlayingCardsJonesMichael {
	 
	
	
	public static void main (String []args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your card using A,K,Q,J,10, and 9-2 for face cards as first digit and H,S,D,C as the second: ");
															//prompt user to input characters
		String character = input.nextLine();
		
		
		switch (character.charAt(character.length()-2)){//create a switch statement to count 2 from end of length
			case 'A':
				System.out.print("Ace of ");
				break;
			case 'K':
				System.out.print("King of ");
				break;
			case 'Q':
				System.out.print("Queen of ");
				break;
			case 'J':
				System.out.print("Jack of ");
				break;
			case '0':
				System.out.print ("Ten of ");//this will work because of .length()-2
				break;
			case '2':
				System.out.print("Two of ");
				break;
			case '3':
				System.out.print("Three of ");
				break;
			case '4':
				System.out.print("Four of ");
				break;
			case '5':
				System.out.print("Five of ");
				break;
			case '6':
				System.out.print("Six of ");
				break;
			case '7':
				System.out.print("Seven of ");
				break;
			case '8':
				System.out.print("Eight of ");
				break;
			case '9':
				System.out.print("Nine of ");
				break;
			
			default:
				System.out.print ("Invalid Input ");//catch to make user enter valid data
            break;
		}
		switch (character.charAt(character.length()-1)){//create a switch statement to count 1 from end of length 
			case 'H':
				System.out.print( "Hearts ");
				break;
			case 'S':
				System.out.print("Spades ");
				break;
			case 'C':
				System.out.print("Clubs ");
				break;
			case 'D':
				System.out.print("Diamonds ");
				break;
			default:
				System.out.print("Invalid Input ");//catch to force user to enter valid data
             break;
		
		}
		
	}
	
}
