package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackjackGUI extends JFrame {

	private Container contentPane;
	private JPanel consolePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JButton playButton = new JButton("Play ");
	private JButton hitButton = new JButton("Hit  ");
	private JButton standButton = new JButton("Stand");
	private JPanel outputPanel = new JPanel();
	private JTextArea console = new JTextArea();
	private JTextArea playerArea = new JTextArea();
	private JTextArea dealerArea = new JTextArea();

	public BlackjackGUI() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		outputPanel.setLayout(new BorderLayout());
		setSize(new Dimension(600, 400));
		setTitle("BlackJack");

		contentPane.add(buttonPanel,  BorderLayout.SOUTH);
		buttonPanel.add(playButton, null);
		buttonPanel.add(hitButton, null);
		buttonPanel.add(standButton, null);
		contentPane.add(outputPanel, BorderLayout.CENTER);
		outputPanel.setLayout(new FlowLayout());
		outputPanel.add(playerArea, null);
		outputPanel.add(dealerArea, null);
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
		playerArea.setText("  ");
		dealerArea.setText("  ");
		int width = getWidth();
		int height = getHeight();
		playerArea.setPreferredSize(new Dimension(width/2-20,height));
		dealerArea.setPreferredSize(new Dimension(width/2-20,height));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void setPlayAction(ActionListener listener){
		playButton.addActionListener(listener);
	}	

	public void setHitAction(ActionListener listener){
		hitButton.addActionListener(listener);
	}

	public void setStandAction(ActionListener listener){
		standButton.addActionListener(listener);
	}
	
	public void displayPlayerText(String msg) {
		playerArea.setText(msg);
	}
	
	public void displayDealerText(String msg) {
		dealerArea.setText(msg);
	}

	public void displayPlayer(Player player){
		playerArea.setText("Player:\n"+player.getHandSum()+"\n"+player);
	}

	public void displayDealer(Player dealer){
		dealerArea.setText("Dealer:\n"+dealer.getHandSum()+"\n"+dealer);
	}

	public void displayDealerCard(String card){
		dealerArea.setText("Dealer Shows:\n"+card);
	}

	public void displayOutcome(String outcome){
		playerArea.setText(playerArea.getText()+"\n\n"+outcome);
	}
	
	public void clearConsoles() {
		playerArea.setText(null);
		dealerArea.setText(null);
	}

	public void enableHitAndStandButtons(){
		playButton.setEnabled(false);
		hitButton.setEnabled(true);
		standButton.setEnabled(true);
	}

	public void enablePlayButton(){
		playButton.setEnabled(true);
		hitButton.setEnabled(false);
		standButton.setEnabled(false);
	}
}