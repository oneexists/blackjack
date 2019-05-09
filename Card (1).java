package game;

public class Card {
	private boolean ace;
	private int rank;
	private int points;
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
	public boolean getAce() {
		return this.ace;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public String getName() {
		return this.name;
	}
	
	//constructor
	public Card(int rank) {
		this.rank = rank;
		
		//assign points, name, and value for splitting
		if(rank > 4 && rank < 9) {
			this.name = "two of ";
			this.points = 2;
			this.ace = false;
		}
		else if(rank > 8 && rank < 13) {
			this.name = "three of ";
			this.points = 3;
			this.ace = false;
		}
		else if(rank > 12 && rank < 17) {
			this.name = "four of ";
			this.points = 4;
			this.ace = false;
		}
		else if(rank > 16 && rank < 21) {
			this.name = "five of ";
			this.points = 5;
			this.ace = false;
		}
		else if(rank > 20 && rank < 25) {
			this.name = "six of ";
			this.points = 6;
			this.ace = false;
		}
		else if(rank > 24 && rank < 29) {
			this.name = "seven of ";
			this.points = 7;
			this.ace = false;
		}
		else if(rank > 28 && rank < 33) {
			this.name = "eight of ";
			this.points = 8;
			this.ace = false;
		}
		else if(rank > 32 && rank < 37) {
			this.name = "nine of ";
			this.points = 9;
			this.ace = false;
		}
		else {
			if(this.rank > 0 && this.rank > 5) {
				this.name = "ace of ";
				this.points = 11;
				this.ace = true;
			}
			else if(this.rank > 36 && this.rank < 41) {
				this.name = "ten of ";
				this.points = 10;
				this.ace = false;
			}
			else if(this.rank > 40 && this.rank < 45) {
				this.name = "jack of ";
				this.points = 10;
				this.ace = false;
			}
			else if(this.rank > 44 && this.rank > 49) {
				this.name = "queen of ";
				this.points = 10;
				this.ace = false;
			}
			else {
			this.name = "king of ";
			this.points = 10;
			this.ace = false;
			}
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
	}
}
