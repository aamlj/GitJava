package card;
import java.util.ArrayList;
/*
@author  Mike Jones
@date    04/26/2015
@class   CSC 251 N01, Spring 2015
*/

public class DeckJonesMike {
	private ArrayList<CardJonesMike> deck;//my deck of cards
	private int index;//index of cards in array list
	
	public DeckJonesMike() {//constructor
		this.index = 0;
		this.deck = new ArrayList<CardJonesMike>();
		// Add Cards to the Deck
		int number = 0;
		String house = "";
		int color = 0;
		boolean face = false;
		String filename = "";
		for (int i = 1; i <= 52; i++) {//for loop to get all the png files
			if (i <= 13) {
				house = "Spades";
				color = CardJonesMike.BLACK;
			} else if (i <= 26) {
				house = "Hearts";
				color = CardJonesMike.RED;
			} else if (i <= 39) {
				house = "Diamonds";
				color = CardJonesMike.RED;
			} else {
				house = "Clubs";
				color = CardJonesMike.BLACK;
			}
			
			if ( (i % 13) == 0)
				number = 13;
			else
				number = i % 13;
			
			if (number > 10 || number == 1) {//set the conditions to check what value to give the card
				face = true;
			}
			
			filename = "card\\" + i + ".png";//set the png to the particular card
			
			CardJonesMike c = new CardJonesMike(number, house, color, face, filename);//add it to the deck
			deck.add(c);
			
		}
		
		shuffle();//shuffle the cards
		
		
	}
	/**
	draws a card from the deck	
@returns index of drawn card:
   */

	public CardJonesMike drawCard() {
		CardJonesMike drawn = this.deck.get( this.index );
		this.index++;
		if (this.index == 52) {
			this.index = 0;
		}
		return drawn;
	}
	/**
	shuffles the cards by swapping the indices 		
 
   */

	public void shuffle() {
		for (int i = 0; i < deck.size(); i++) {
			int index = (int)(Math.random() * deck.size());
			CardJonesMike temp = deck.get(i);
			deck.set(i, deck.get(index));
			deck.set(index, temp);
		}
	}
	
	public static void main(String[] args) {//test the program
		DeckJonesMike deck = new DeckJonesMike();
		for (int i = 0; i < 2; i++) {
			CardJonesMike c = deck.drawCard();
			System.out.println(c.getFilename());
		}

	}

}