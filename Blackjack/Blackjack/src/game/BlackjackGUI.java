/*
 * implement split hand into player hand panel
 * action performed override at line 134?
 * buttons: lines 86-116
 */
package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class BlackjackGUI extends JFrame implements ActionListener {
	public String name;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackjackGUI frame = new BlackjackGUI("Blackjack");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlackjackGUI(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel dealerPanel = new JPanel();
		contentPane.add(dealerPanel);
		
		JLabel lblDeckImage = new JLabel("Deck Image");
		dealerPanel.add(lblDeckImage);
		
		JLabel lblDealerHand = new JLabel("Dealer Hand");
		dealerPanel.add(lblDealerHand);
		
		JPanel playerPanel = new JPanel();
		contentPane.add(playerPanel);
		
		JLabel lblPlayerHand = new JLabel("Player Hand");
		playerPanel.add(lblPlayerHand);
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(1, 4, 0, 0));
		
		JButton btnDealGame = new JButton("Deal Game");
		buttonPanel.add(btnDealGame);
		btnDealGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deck gameDeck = new Deck();
				gameDeck.dealGame();
				
			}
		});
		
		JButton btnHit = new JButton("Hit");
		buttonPanel.add(btnHit);
		btnHit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//addCard(dealCard());
			}
		});
		
		JButton btnStay = new JButton("Stay");
		buttonPanel.add(btnStay);
		btnStay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent l) {
				//play dealerHand
				//determine winner
			}
		});
		
		JButton btnSplit = new JButton("Split?");
		buttonPanel.add(btnSplit);
		btnSplit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent l) {
				//isSplit
					//if false, continue
				//canItSplit
					//if true, split hand
				//splitHand
			}
		});
		
		JPanel consolePanel = new JPanel();
		consolePanel.setBorder(new TitledBorder(null, "Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(consolePanel);
		consolePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea textArea = new JTextArea();
		consolePanel.add(textArea);
	}
	
	//methods
	
	/*public void setConsole(String input) {
		this.consolePanel.append("\n" + input);
	}*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
