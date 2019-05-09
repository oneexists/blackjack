package game;

public class Player {
	private int numCards;
	private int handSum;
	private int aces;
	private boolean keepPlaying = false;
	private Card[] hand = new Card [15];
	
	//constructor
	public Player() {
		this.numCards = 0;
		this.handSum = 0;
		this.aces = 0;
	}
	
	//getters
	public boolean getKeepPlaying() {
		return this.keepPlaying;
	}
	
	public int getHandSum() {
		handSum = 0;
		for (int i = 1; i <= numCards; ++i) {
			handSum += hand[i].getPoints();
		}
		while (aces > 0 && handSum > 21) {
			handSum -= 10;
		}
		return this.handSum;
	}
	
	//setters
	public void addAce() {
		this.aces++;
	}
	public void setKeepPlaying(Boolean keepGoing) {
		this.keepPlaying = keepGoing;
	}
	
	//methods
	public void addCard(Card card) {
		numCards++;
		this.hand[numCards] = card;
	}
	
	public void hit(Card draw) {
		this.addCard(draw);
	}
	
	public String printHand(Boolean isDealer) {
		String allCards = null;
		if (isDealer == false) {
			//prints all cards
			for (int i = 0; i <= numCards; ++i) {
				allCards += "\n" + this.hand[i].getName();
			}
		}
		//else {
			//prints all but dealer's top card
			//for (int i = 0; i < numCards; ++i) {
			//	allCards += "\n" + this.hand[i].getName();
			//}
			//adds line to indicate hidden card in hand
			allCards += "\n***hidden card***";
		//}
		return allCards;
	}
}
