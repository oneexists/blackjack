package game;

public class DealerHand {
	private int numCards = 0;
	private int handSum = 0;
	private int aces = 0;
	private Card[] hand = new Card[numCards];
	
	//constructors
	public DealerHand() {
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
	
	public void playHand() {
		if (this.getHandSum() >= 17) {
			//this.addCard(aCard);
		}
		else if (this.getHandSum() > 21) {
			//end game
		}
		else
			//pass
			
		this.showCards(numCards);
	}
	
	public void showCards(int numCards) {
		if (numCards >= 2) {
			for(int i = 0; i < this.numCards - 1; i++) {
			System.out.println(hand[i].getName());
			}
		}
	}
}
