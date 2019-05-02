package game;

import java.util.Random;
import java.util.Scanner;

public class Deck {
	public static final int CARDS = 52;
	private boolean[] inDeck = new boolean[CARDS];
	Card[] deck = new Card[CARDS];
	Random r = new Random();
	private int currentCard = 0;
	Scanner keyboard = new Scanner(System.in);
	
	//methods
		//creating a deck
	public Card[] deck() {
		for (int i = 0; i < CARDS; ++i) {
		    this.getNextCard(); 
		}
		
		return deck;
	}
	
	public int getNextCard(){
	    int i = r.nextInt(52);
	    
	    while(inDeck[i]) {
	        i = r.nextInt(52);
	    }
	    
	    inDeck[i] = true;
	    return i;
	}
	
		//dealCard
	public Card dealCard() {
		Card card = deck[currentCard];
		currentCard++;
		return card;
	}
	
	public void dealGame() {
		//initialize deck
		deck();
		
		//get player name and make new player
		System.out.print("Enter player name: ");
		String name = keyboard.nextLine();
		PlayerHand player = new PlayerHand(name);
		
		//make dealer hand
		DealerHand dealer = new DealerHand();
		
		//deal cards
		player.addCard(dealCard());
		dealer.addCard(dealCard());
		player.addCard(dealCard());
		dealer.addCard(dealCard());	
	}
}
