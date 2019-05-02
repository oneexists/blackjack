/*
 * implement endGame to addCard method
 */
package game;

public class PlayerHand {
	private int numCards = 0;
	private int handSum = 0;
	private int aces = 0;
	private Card[] hand = new Card[20];
	
	//constructors
	public PlayerHand() {
		this.numCards = 0;
		this.handSum = 0;
		this.aces = 0;
	}
	
	//methods
		//getters and setters
	public int getHandSum() {
		for (int i = 0; i < this.numCards; i++) {
			if (hand[i].getAce() == true) {
				aces++;
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
	
		//add card
	public int addCard(Card aCard) {
		this.hand[numCards] = aCard;
		this.numCards++;
		if (this.getHandSum() >= 21) {
			//this.endGame();
		}
		
		return (this.getHandSum());
	}
	
		//remove card
	public boolean removeCard(Card aCard, int currentCard) {
		this.hand[currentCard] = null;
		for(int i = 0; i < numCards - 1; ++i) {
			if(i < currentCard) {
				continue;
			}
			else
				this.hand[i] = this.hand[i + 1];
		}
		numCards -= 1;
		return true;
	}
	
		//splitting hand
	public boolean canItSplit() {
		int[] values = new int[numCards];
		for (int i = 0; i < this.numCards; i++) {
			values[i] = hand[i].getValue();
		}
		for (int j = 0; j < this.numCards; j++) {
			if (values[j] == (values[j] = 1)) {
				return true;
			}
			else
				continue;
		}
		return false;
	}
}
