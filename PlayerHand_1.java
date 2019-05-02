package game;

public class PlayerHand {
	private String name;
	private int numCards = 0;
	private int handSum = 0;
	private int aces = 0;
	private Card[] hand = new Card[numCards];
	
	//constructors
	public PlayerHand(String aName) {
		this.name = aName;
		this.emptyHand();
	}
	
	//methods
	public void emptyHand() {
		this.numCards = 0;
	}
	
	public boolean addCard(Card aCard) {
		numCards++;
		this.hand[numCards] = aCard;
		return (this.getHandSum() <=21);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHandSum() {
		for (int i = 0; i < this.numCards; i++) {
			if (hand[i].getAce() == true) {
				aces++;
				handSum += 11;
			}
			else {
				handSum += hand[i].getValue();
			}
			
			while (handSum > 21 && aces > 0) {
				handSum -= 10;
				aces--;
			}
		}
		return handSum;
	}

}
