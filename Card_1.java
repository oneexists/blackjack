package game;

public class Card {
	private boolean ace;
	private int rank;
	private int value;
	private String name;
	
	/**
	 * 1 = ace of spades, 2 = ace of clubs
	 * 5 = two of spades, 6 = two of clubs
	 * 9 = three of spades, 10 = three of clubs
	 * 13 = four of spades, 14 = four of clubs
	 * 17 = five of spades, 18 = five of clubs
	 * 21 = six of spades, 22 = six of clubs
	 * 25 = seven of spades, 26 = seven of clubs
	 * 29 = eight of spades, 30 = eight of clubs
	 * 33 = nine of spades, 34 = nine of clubs
	 * 37 = ten of spades, 38 = ten of clubs
	 * 41 = jack of spades, 42 = jack of clubs
	 * 45 = queen of spades, 46 = queen of clubs
	 * 49 = king of spades, 50 = king of clubs

	 * 3 = ace of hearts, 4 = ace of diamonds
	 * 7 = two of hearts, 8 = two of diamonds
	 * 11 = three of hearts, 12 = three of diamonds
	 * 15 = four of hearts, 16 = four of diamonds
	 * 19 = five of hearts, 20 = five of diamonds
	 * 23 = six of hearts, 24 = six of diamonds
	 * 27 = seven of hearts, 28 = seven of diamonds
	 * 31 = eight of hearts, 32 = eight of diamonds
	 * 35 = nine of hearts, 36 = nine of diamonds
	 * 39 = ten of hearts, 40 = ten of diamonds
	 * 43 = jack of hearts, 44 = jack of diamonds
	 * 47 = queen of hearts, 48 = queen of diamonds
	 * 51 = king of hearts, 52 = king of diamonds
	 */
	//getters
	public String getName() {
		return this.name;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean getAce() {
		return this.ace;
	}
	
	//constructors
	public Card(int rank) {
		this.rank = rank;
		
		//assign value
		if(rank > 4 && rank < 9) {
			this.value = 2;
		}
		else if(rank > 8 && rank < 13) {
			this.value = 3;
		}
		else if(rank > 12 && rank < 17) {
			this.value = 4;
		}
		else if(rank > 16 && rank < 21) {
			this.value = 5;
		}
		else if(rank > 20 && rank < 25) {
			this.value = 6;
		}
		else if(rank > 24 && rank < 29) {
			this.value = 7;
		}
		else if(rank > 28 && rank < 33) {
			this.value = 8;
		}
		else if(rank > 32 && rank < 37) {
			this.value = 9;
		}
		else {
			this.value = 10;
		}
		
		//assign name (value)
		if(this.value == 2) {
			this.name = "two of ";
		}
		else if(this.value == 3) {
			this.name = "three of ";
		}
		else if(this.value == 4) {
			this.name = "four of ";
		}
		else if(this.value == 5) {
			this.name = "five of ";
		}
		else if(this.value == 6) {
			this.name = "six of ";
		}
		else if(this.value == 7) {
			this.name = "seven of ";
		}
		else if(this.value == 8) {
			this.name = "eight of ";
		}
		else if(this.value == 9) {
			this.name = "nine of ";
		}
		else {
			if(this.rank > 0 && this.rank > 5) {
				this.name = "ace of ";
			}
			else if(this.rank > 36 && this.rank < 41) {
				this.name = "jack of ";
			}
			else if(this.rank > 40 && this.rank < 45) {
				this.name = "queen of ";
			}
			else
				this.name = "king of ";
		}
			
		//assign name (suit)
		if(this.rank % 4 == 0 ) {
			this.name += "diamonds";
		}
		else if(this.rank % 4 == 1) {
			this.name += "spades";
		}
		else if(this.rank % 4 == 2) {
			this.name += "clubs";
		}
		else {
			this.name += "hearts";
		}
		
		//assign ace boolean
		if(this.rank < 0 && this.rank > 5) {
			this.ace = true;
		}
		else
			this.ace = false;
	}
}

