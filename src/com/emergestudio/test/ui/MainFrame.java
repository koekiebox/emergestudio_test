package com.emergestudio.test.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.emergestudio.test.ui.ITicTacToeSquare.Symbol;
import com.emergestudio.test.ui.impl.TicTacToeSquare;

/**
 * TODO **** None of the code may be changed in this class. ****
 * 
 * @author jasonbruwer
 *
 *	TODO * Use this class to get an idea of what needs to be done.
 */
public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8949800053857099819L;
	
	private JPanel contentPane;
	
	private JPanel panel = null;
	
	private ITicTacToeSquare ticTacToeSquare;
	
	private JLabel infoLabel;
	
	private Player playerOne;
	private Player playerTwo;
	
	private Player activePlayer;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		this.ticTacToeSquare = new TicTacToeSquare();
		
		setResizable(false);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int height = 533;
		int width = 467;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		setBounds((d.width-width)/2, (d.height-height)/2, width, height);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 450, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//New Game Button...
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewGameAction(e);
			}
		});
		btnNewGame.setBounds(6, 468, 117, 29);
		contentPane.add(btnNewGame);
		
		this.infoLabel = new JLabel("Click 'New Game' to start.");
		infoLabel.setBounds(135, 473, 321, 16);
		contentPane.add(infoLabel);
	}
	
	/**
	 * @param panelToAddButtonsToParam
	 */
	private void initializeButtons()
	{
		ActionListener ticTacToeActionList = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTicTacToeAction(e);
			}
		};
		
		this.panel.removeAll();
		
		JButton btn1_1 = new TicTacButton(1,1);
		btn1_1.addActionListener(ticTacToeActionList);
		btn1_1.setBounds(0, 0, 150, 150);
		this.panel.add(btn1_1);
		
		JButton btn1_2 = new TicTacButton(1,2);
		btn1_2.addActionListener(ticTacToeActionList);
		btn1_2.setBounds(150, 0, 150, 150);
		this.panel.add(btn1_2);
		
		JButton btn1_3 = new TicTacButton(1,3);
		btn1_3.addActionListener(ticTacToeActionList);
		btn1_3.setBounds(300, 0, 150, 150);
		this.panel.add(btn1_3);
		
		JButton btn2_1 = new TicTacButton(2,1);
		btn2_1.addActionListener(ticTacToeActionList);
		btn2_1.setBounds(0, 150, 150, 150);
		this.panel.add(btn2_1);
		
		JButton btn2_2 = new TicTacButton(2,2);
		btn2_2.addActionListener(ticTacToeActionList);
		btn2_2.setBounds(150, 150, 150, 150);
		this.panel.add(btn2_2);
		
		JButton btn2_3 = new TicTacButton(2,3);
		btn2_3.addActionListener(ticTacToeActionList);
		btn2_3.setBounds(300, 150, 150, 150);
		this.panel.add(btn2_3);
		
		JButton btn3_1 = new TicTacButton(3,1);
		btn3_1.addActionListener(ticTacToeActionList);
		btn3_1.setBounds(0, 300, 150, 150);
		this.panel.add(btn3_1);
		
		JButton btn3_2 = new TicTacButton(3,2);
		btn3_2.addActionListener(ticTacToeActionList);
		btn3_2.setBounds(150, 300, 150, 150);
		this.panel.add(btn3_2);
		
		JButton btn3_3 = new TicTacButton(3,3);
		btn3_3.addActionListener(ticTacToeActionList);
		btn3_3.setBounds(300, 300, 150, 150);
		this.panel.add(btn3_3);
	}

	/**
	 * When the New Game button is clicked.
	 * 
	 * @param eParam
	 */
	private void btnNewGameAction(ActionEvent eParam)
	{
		PlayerInfo playerInfo = new PlayerInfo();
		
		playerInfo.setVisible(true);
		
		if(! playerInfo.isWasCancelAction())
		{
			this.playerOne = new Player(1,playerInfo.getPlayerOneName(),Symbol.Cross);
			this.playerTwo = new Player(2,playerInfo.getPlayerTwoName(),Symbol.Nought);
			
			this.activePlayer = playerOne;
			
			this.infoLabel.setText("'"+this.activePlayer.getName()+"' it's your turn.");
			
			this.initializeButtons();
			
			this.ticTacToeSquare.newGame();
		}
	}
	
	/**
	 * When one of the Tic-Tac-Toe buttons are clicked.
	 * 
	 * @param eParam
	 */
	private void btnTicTacToeAction(ActionEvent eParam)
	{
		Object source = eParam.getSource();
		
		if(source instanceof TicTacButton)
		{
			TicTacButton ticTacButton = (TicTacButton)source;
			
			if(ticTacButton.isAlreadyUsed())
			{
				return;
			}
			
			if(this.activePlayer.getSymbol() == Symbol.Cross)
			{
				ticTacButton.setImageCross();
			}
			else
			{
				ticTacButton.setImageNought();
			}
			
			if(this.ticTacToeSquare.play(
					this.activePlayer, 
					ticTacButton.getXLocation(), 
					ticTacButton.getYLocation()))
			{
				if(this.ticTacToeSquare.wasGameADraw())
				{
					JOptionPane.showMessageDialog(this,"Its a draw.");
				}
				else
				{
					JOptionPane.showMessageDialog(this,
						    "Congrats '"+this.activePlayer.getName()+"', you WON!!!.");
				}
				
				this.infoLabel.setText("Click 'New Game' to start.");
				this.initializeButtons();
			}
			else
			{
				this.switchTurns();	
			}
		}
	}
	
	/**
	 * Changes the active player.
	 */
	private void switchTurns()
	{
		if(this.activePlayer.equals(this.playerOne))
		{
			this.activePlayer = this.playerTwo;
		}
		else
		{
			this.activePlayer = this.playerOne;
		}
		
		this.infoLabel.setText("'"+this.activePlayer.getName()+"' it's your turn.");
	}
}
