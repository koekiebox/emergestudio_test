package com.emergestudio.test;

import java.awt.EventQueue;

import com.emergestudio.test.ui.MainFrame;

/**
 * TODO **** None of the code may be changed in this class. ****
 * 
 * @author jasonbruwer
 * 
 * TODO * This is the starting point of the Tic-Tac-Toe application.
 * TODO * You may proceed to the MainFrame.java file.
 */
public class Main {

	/**
	 * @param args
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
}
