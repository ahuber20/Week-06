package war;

public class App {

	public static void main(String[] args) {
		
		//Initializes a new deck.
		System.out.println("New Deck \n----------------");
		Deck deck = new Deck();
		
		//Prints the info of the deck.
		deck.describe();
		
		//Shuffles the deck
		deck.shuffle();
		System.out.println("\nShuffled \n----------------");
		
		deck.describe();
		
		//Creates new players and sets their names.
		Player player1 = new Player();
		player1.setName("Adom");
		
		Player player2 = new Player();
		player2.setName("Jose");
		
		//Players are given 1 of every other card.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		//Prints out the player decks.
		System.out.println("\n" + player1.getName() + "'s cards are - " + player1.getHand());
		System.out.println("\n" + player2.getName() + "'s cards are - " + player2.getHand());
		
		//Initializes the drawn card for each player.
		Card player1Card;
		Card player2Card;
		
		for (int i = 0; i < 26; i++) {
			System.out.println("\nDraw " + (i + 1) + "\n-----------");
			
			//Takes the card from the top of each players' hand.
			player1Card = player1.flipCard();
			player2Card = player2.flipCard();
			
			//Prints the description of each players' card.
			System.out.print(player1.getName() + " draws a(n) "); player1Card.describe();
			System.out.print(player2.getName() + " draws a(n) "); player2Card.describe();
			
			//Compares the values of each players' card. The one with the higher value wins the draw otherwise no points are awarded.
			if (player1Card.value() > player2Card.value()) {
				System.out.println(player1.getName() + " wins this draw!");
				player1.score++;
			} else if (player2Card.value() > player1Card.value()) {
				System.out.println(player2.getName() + " wins this draw!");
				player2.score++;
			} else {
				System.out.println("Nobody wins this draw!");
			}
			
		}
		
		//Announces the final score and the winner of the game. If the scores are tied then nobody wins.
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\n" + player1.getName() + " wins the game with " + player1.getScore() + " score!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("\n" + player2.getName() + " wins the game with " + player2.getScore() + " score!");
		} else {
			System.out.println("\nThe score was a tie! There is no winner!");
		}
		
	}

}
