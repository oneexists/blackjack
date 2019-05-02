/*
 * endGame method
 */


package game;

import java.util.Random;
import java.util.Scanner;

public class Deck {
	public static final int CARDS = 52;
	private boolean[] inDeck = new boolean[CARDS];
	Card[] deck = new Card[CARDS];
	Random r = new Random();
	private int currentCard = 0;
	PlayerHand player = new PlayerHand();
	DealerHand dealer = new DealerHand();
	public static boolean split = false;
	
	//methods
		//get next card
	public int getNextCard(){
		int i = r.nextInt(52);
		while(inDeck[i]) {
		    i = r.nextInt(52);
		}
		inDeck[i] = true;
		return i;
	}
	
		//create the deck
	public Card[] deck() {
		for (int i = 0; i < CARDS; ++i) {
		    Card j = new Card(getNextCard());
		    deck[i] = j;
		}
		return deck;
	}
	
		//deal the card
	public Card dealCard() {
		Card card = deck[currentCard];
		currentCard++;
		return card;
	}
	
		//deal the game
	public void dealGame() {
		//initialize deck
		this.deck();
		//deal cards
		player.addCard(dealCard());
		dealer.addCard(dealCard());
		player.addCard(dealCard());
		dealer.addCard(dealCard());	
	}
	
		//split hand
	public void splitHand(Card splitCard, int cardPosition) {
		PlayerHand splitHand = new PlayerHand();
		splitHand.addCard(splitCard);
		player.removeCard(splitCard, cardPosition);
		split = true;	
	}
		
		/*
		 * splitHand.getHandSum() doesn't work
		 * floating else for all hands over 21?
		 * implement GUI
		//end game 
	public String endGame() {
		if (split == false) {
			if (dealer.getHandSum() > player.getHandSum()) {
				//dealer wins
				return("Dealer wins.");
			}
			else if (dealer.getHandSum() < player.getHandSum()) {
				//player wins
				return("You win!");
			}
		}
		else {
			if (dealer.getHandSum() > player.getHandSum() 
				&& dealer.getHandSum() > splitHand.getHandSum()) {
					//dealer wins
					return("Dealer wins.");
				}
			else if (player.getHandSum() > dealer.getHandSum()
					|| splitHand.getHandSum() > dealer.getHandSum()) {
						//player wins
						return("You win!");
			}
	}*/
}
