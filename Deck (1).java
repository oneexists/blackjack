package game;

import java.util.Random;

public class Deck {
	public static final int CARDS = 52;
	private Card[] cards = new Card[CARDS];
	private boolean[] inDeck = new boolean[CARDS];
	Random r = new Random();
	private static int currentCard = 0;
	
	//constructor
	public Deck() {
		
		for (int c = 0; c < CARDS; ++c) {
			int i = r.nextInt(52);
			while(inDeck[i]) {
				i = r.nextInt(52);
			}
			inDeck[i] = true;
			this.cards[c] = new Card(i);
		}
	}
	
	//methods
	public Card drawCard() {
		currentCard++;
		return this.cards[currentCard];
	}
	
}
