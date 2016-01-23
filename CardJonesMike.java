package week14;

public class CardJonesMike {
	public static final int BLACK = 0;
	public static final int RED = 1;
	
	private int number;
	private String house;
	private int color;
	private boolean isFaceCard;
	private String filename;
	
	public CardJonesMike(int number, String house, int color, 
				boolean isFaceCard, String filename) {
		this.number = number;
		this.house = house;
		this.color = color;
		this.isFaceCard = isFaceCard;
		this.filename = filename;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public boolean isFaceCard() {
		return isFaceCard;
	}

	public void setFaceCard(boolean isFaceCard) {
		this.isFaceCard = isFaceCard;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public boolean isAce() {
		if (number == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getValue() {
		if ( isAce() ) {
			return 11;
		} else if (isFaceCard) {
			return 10;
		} else {
			return number;
		}
	}
	
	@Override
	public String toString() {
		String printOut = "";
		switch(number) {
		case 1: printOut = "Ace of " + house;
				break;
		case 2: printOut = "Two of " + house;
				break;
		case 3: printOut = "Three of " + house;
				break;
		case 4: printOut = "Four of " + house;
				break;
		case 5: printOut = "Five of " + house;
				break;
		case 6: printOut = "Six of " + house;
				break;
		case 7: printOut = "Seven of " + house;
				break;
		case 8: printOut = "Eight of " + house;
				break;
		case 9: printOut = "Nine of " + house;
				break;
		case 10:printOut = "Ten of " + house;
				break;
		case 11:printOut = "Jack of " + house;
				break;
		case 12:printOut = "Queen of " + house;
				break;
		case 13:printOut = "King of " + house;
				break;
		}
		return printOut;
	}

}