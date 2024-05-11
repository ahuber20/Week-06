package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Initializes our player name, score, and hand.
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	//Player constructor.
	public Player() {
		
	}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	//Takes the draw method from the Deck class and adds it to the player hand.
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Shows the card at the top of the players hand.
	public Card flipCard() {
		return hand.remove(0);
	}
	
	//Increases the score.
	public void increaseScore() {
		score++;
	}
	
	//Getters and setters.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
