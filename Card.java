package war;

public class Card {
	//Initializes the value and name of the cards.
	@SuppressWarnings("unused")
	//An unused warning appears for value, however upon deleting this value the public card method breaks.
	private int value;
	private String name;
	
	//Sets up the card value with the suit.
	public Card(int value, String suit) {
		this.value = value;
		
		//Sets the name of each card.
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
			
		}
		
		//Finishes the card name with the suit.
		name += " of " + suit;
		
	}
	
	//Returns the name as a string.
	public String toString() {
		return name;
	}
	
	//Describes the specific card.
	public void describe() {
		
		System.out.println(name);
		
	}
	
	public int value() {
		return value;
	}
	
	


	
}
