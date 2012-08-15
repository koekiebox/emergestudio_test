package com.emergestudio.test.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8949800053857099819L;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 450, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		ActionListener ticTacToeActionList = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTicTacToeAction(e);
			}
		};
		
		
		JButton btn1_1 = new JButton("");
		btn1_1.addActionListener(ticTacToeActionList);
		btn1_1.setBounds(0, 0, 150, 150);
		panel.add(btn1_1);
		
		JButton btn1_2 = new JButton("");
		btn1_2.addActionListener(ticTacToeActionList);
		btn1_2.setBounds(150, 0, 150, 150);
		panel.add(btn1_2);
		
		JButton btn1_3 = new JButton("");
		btn1_3.addActionListener(ticTacToeActionList);
		btn1_3.setBounds(300, 0, 150, 150);
		panel.add(btn1_3);
		
		JButton btn2_1 = new JButton("");
		btn2_1.addActionListener(ticTacToeActionList);
		btn2_1.setBounds(0, 150, 150, 150);
		panel.add(btn2_1);
		
		JButton btn2_2 = new JButton("");
		btn2_2.addActionListener(ticTacToeActionList);
		btn2_2.setBounds(150, 150, 150, 150);
		panel.add(btn2_2);
		
		JButton btn2_3 = new JButton("");
		btn2_3.addActionListener(ticTacToeActionList);
		btn2_3.setBounds(300, 150, 150, 150);
		panel.add(btn2_3);
		
		JButton btn3_1 = new JButton("");
		btn3_1.addActionListener(ticTacToeActionList);
		btn3_1.setBounds(0, 300, 150, 150);
		panel.add(btn3_1);
		
		JButton btn3_2 = new JButton("");
		btn3_2.addActionListener(ticTacToeActionList);
		btn3_2.setBounds(150, 300, 150, 150);
		panel.add(btn3_2);
		
		JButton btn3_3 = new JButton("");
		btn3_3.addActionListener(ticTacToeActionList);
		btn3_3.setBounds(300, 300, 150, 150);
		panel.add(btn3_3);
		
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewGameAction(e);
			}
		});
		btnNewGame.setBounds(6, 468, 117, 29);
		contentPane.add(btnNewGame);
	}

	/**
	 * @param eParam
	 */
	private void btnNewGameAction(ActionEvent eParam)
	{
		
	}
	
	/**
	 * @param eParam
	 */
	private void btnTicTacToeAction(ActionEvent eParam)
	{
		
		
		
	}
	
}
