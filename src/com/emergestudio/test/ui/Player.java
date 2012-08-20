/**
 * 
 */
package com.emergestudio.test.ui;

/**
 * TODO Fix the equals() and hashCode() methods.
 * 
 * @author jasonbruwer
 */
public class Player {
	private ITicTacToeSquare.Symbol symbol;
	
	private String name;
	private int id;
	
	/**
	 * @param idParam
	 * @param nameParam
	 * @param symbolParam
	 */
	public Player(
			int idParam,
			String nameParam,
			ITicTacToeSquare.Symbol symbolParam) 
	{
		super();
		
		this.name = nameParam;
		this.symbol = symbolParam;
		this.id = idParam;
	}

	/**
	 * @return the symbol
	 */
	public ITicTacToeSquare.Symbol getSymbol() 
	{
		return this.symbol;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * TODO fix this equals method.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object objParam) 
	{
		return false;
	}
	
	/**
	 * TODO fix this hashCode method.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() 
	{
		return 0;
	}
}
