package game;

public class Card {
	private int rank;
	private int suit;
	String[] RANKS = {null, "Low Ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "Jack", "Queen", "King", "High Ace"};
	String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};	
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Card() {
		
	}
	
	
	public String toString() {
		
		String s = RANKS[this.rank] + " of " + SUITS[this.suit];
		return s;
		}
	}

