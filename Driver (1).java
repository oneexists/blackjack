package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver {
	public Player player;
	public Player dealer;
	public Deck deck;
	public BlackjackGUI GUI;
	
	public Driver() {
		GUI =  new BlackjackGUI();
		GUI.setPlayAction(new PlayAction());
		//GUI.setHitAction(new HitAction());
		//GUI.setStandAction(new StandAction());
		GUI.enablePlayButton();
		
	}
	
	class PlayAction implements ActionListener {
		 public void actionPerformed (ActionEvent e) {
			 deck = new Deck();
			 player = new Player();
			 dealer = new Player();
			 player.setKeepPlaying(true);
			 dealer.setKeepPlaying(true);
				//deal starting cards
			 player.addCard(deck.drawCard());
			 dealer.addCard(deck.drawCard());
			 player.addCard(deck.drawCard());
			 dealer.addCard(deck.drawCard());
				//display cards
			 GUI.displayPlayer(player);
			 GUI.displayDealerCard(dealer.printHand(true));
			 while (player.getKeepPlaying() == true && dealer.getKeepPlaying() == true) {
				//enable hit and stand buttons
			 GUI.enableHitAndStandButtons();
		 }
			 if (player.getHandSum() <= 21) {
					GUI.displayPlayer(player);
					GUI.displayPlayerText("Hit or stay?");	
				}
			 else if (player.getHandSum() > 21) {
					GUI.displayPlayerText("Bust.");
					player.setKeepPlaying(false);
				}
	
	}
class HitAction implements ActionListener{ 
	public void actionPerformed (ActionEvent e) {
		//if hit button is pressed
		Card draw = deck.drawCard();
		if (draw.getAce() == true) {
			player.addAce();
		}
		player.hit(draw);
		player.printHand(false);
	}
}

class StandAction implements ActionListener{
	public void actionPerformed (ActionEvent e) {
		//if stay button is pressed, player will stop playing
		player.setKeepPlaying(false);
	}


}	
	}

	public static void main(String[] args){
	//Starts the game
	new Driver();
}







}
		
	
	
	
	
	
	
	
	
	
	/*	//if player or dealer keep playing, keep turns going
		while (player.getKeepPlaying() == true && dealer.getKeepPlaying() == true) {
			//if player hasn't busted, offer a card
			if (player.getHandSum() <= 21) {
				GUI.displayPlayer(player);
				GUI.displayPlayerText("Hit or stay?");	
			}

			else if (player.getHandSum() > 21) {
				GUI.displayPlayerText("Bust.");
				player.setKeepPlaying(false);
			}

			//if the dealer can hit, deal card
			else if (dealer.getHandSum() <= 17) {
				GUI.displayDealerText("The dealer hits.");
				Card draw = theDeck.drawCard();
				if (draw.getAce() == true) {
					dealer.addAce();
				}
				dealer.hit(draw);
				dealer.printHand(true);
			}
			//else the dealer will stay and stop playing
			else if (dealer.getHandSum() < 22){
				GUI.displayDealerText("The dealer stays.");
				dealer.setKeepPlaying(false);
			}
			//dealer busts
			else {
				GUI.displayDealerText("Dealer is bust.");
				dealer.setKeepPlaying(false);
			}


			if (player.getHandSum() > dealer.getHandSum()) {
				GUI.displayDealer(dealer);
				GUI.displayPlayer(player);
				GUI.displayOutcome("Win");
			}
			else {
				GUI.displayDealerText("Dealer wins!");
			}
		
		}
		
	}

} */
