package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
		//Creates the list of card.
		List<Card> cards = new ArrayList<Card>();
		//Initializes and sets all of the suits.
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		
		//Initializes the deck and assigns each value a suit and a name.
		Deck() {
			int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
			
			for (String suit : suits) {
				for (Integer name : values) {
					cards.add(new Card(name, suit));
				}
			}
		}
		
		//Describes each card in the list of cards using the method from the card class.
		public void describe() {
			for (Card card : cards) {
				card.describe();
			}
		}
		
		//Shuffles the deck of cards.
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		//Removes the card at the top of the list and returns it to the player hand.
		public Card draw() {
			Card card = cards.remove(0);
			return card;
		}
		
		
}
