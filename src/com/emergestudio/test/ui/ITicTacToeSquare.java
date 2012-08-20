/**
 * 
 */
package com.emergestudio.test.ui;

/**
 * TODO **** None of the code may be changed in this class. ****
 * 
 * @author jasonbruwer
 *
 *	TODO The contract for a Tic Tac Toe square.
 */
public interface ITicTacToeSquare {
	
	/**
	 * @author jasonbruwer
	 */
	public enum Symbol
	{
		None,
		Nought,
		Cross
	}
	
	/**
	 * When the new game button is clicked.
	 */
	public void newGame();
	
	/**
	 * Each time a button is clicked the play will be called.
	 * 
	 * @param playerParam - The active player.
	 * @param xLocationParam
	 * @param yLocationParam
	 * @return boolean - Whether the play caused the game to end.
	 */
	public boolean play(Player playerParam,int xLocationParam,int yLocationParam);
	
	/**
	 * Whether the game is done but there was no winner.
	 * 
	 * @return
	 */
	public boolean wasGameADraw();
}
