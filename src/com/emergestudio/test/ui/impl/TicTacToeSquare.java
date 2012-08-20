/**
 * 
 */
package com.emergestudio.test.ui.impl;

import com.emergestudio.test.ui.ITicTacToeSquare;
import com.emergestudio.test.ui.Player;

/**
 * @author jasonbruwer
 *
 *	TODO Finish this class so that the Tic Tac Toe application works according to http://en.wikipedia.org/wiki/Tic-tac-toe
 */
public class TicTacToeSquare implements ITicTacToeSquare{
	private Symbol[][] square;
	
	private static final int DIMENSION = 3;
	
	/**
	 */
	public TicTacToeSquare() 
	{
		super();
		
		this.newGame();
	}

	/**
	 * TODO nothing needs to be done here.
	 * 
	 * @see com.emergestudio.test.ui.ITicTacToeSquare#newGame()
	 */
	@Override
	public void newGame() {
		this.square = new Symbol[DIMENSION][];
		
		for(int indexX = 0;indexX < DIMENSION;indexX++)
		{
			this.square[indexX] = new Symbol[DIMENSION];
			
			for(int indexY = 0;indexY < DIMENSION;indexY++)
			{
				this.square[indexX][indexY] = Symbol.None;
			}
		}
	}

	/**
	 * TODO finish the implementation.
	 * TODO @see com.emergestudio.test.ui.ITicTacToeSquare#play(com.emergestudio.test.ui.Player, int, int) for required result. 
	 * 
	 * 
	 * @see com.emergestudio.test.ui.ITicTacToeSquare#play(com.emergestudio.test.ui.Player, int, int)
	 */
	@Override
	public boolean play(
			Player playerParam, 
			int xLocationParam,
			int yLocationParam){
		
		this.square[xLocationParam-1][yLocationParam-1] = playerParam.getSymbol();
		
		//TODO add code here...
		
		return false;
	}

	/**TODO determine whether game was drawn.
	 * 
	 * @see com.emergestudio.test.ui.ITicTacToeSquare#wasGameADraw()
	 */
	@Override
	public boolean wasGameADraw() {
		return false;
	}
}
