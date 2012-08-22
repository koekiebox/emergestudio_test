/**
 * 
 */
package com.emergestudio.test.ui;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * TODO **** None of the code may be changed in this class. ****
 * 
 * @author jasonbruwer
 */
public class TicTacButton extends JButton {
	
	private int xLocation;
	private int yLocation;
	
	private boolean isAlreadyUsed = false;
	
	/**
	 */
	private static final long serialVersionUID = -8698602751195862401L;
	
	private static final String CROSS_PATH = "/com/emergestudio/test/ui/image/Cross.png";
	private static final String NOUGHT_PATH = "/com/emergestudio/test/ui/image/Nought.png";
	
	/**
	 * @param xLocationParam
	 * @param yLocationParam
	 */
	public TicTacButton(int xLocationParam,int yLocationParam)
	{
		super("");
		
		this.xLocation = xLocationParam;
		this.yLocation = yLocationParam;
		
		this.setImageNone();
	}

	/**
	 * @return the xLocation
	 */
	public int getXLocation() {
		return this.xLocation;
	}

	/**
	 * @return the yLocation
	 */
	public int getYLocation() {
		return this.yLocation;
	}
	
	/**
	 * @return
	 */
	public boolean isAlreadyUsed()
	{
		return this.isAlreadyUsed;
	}
	
	/**
	 */
	public void setImageCross()
	{
		this.setIcon(new ImageIcon(MainFrame.class.getResource(CROSS_PATH)));
		this.isAlreadyUsed = true;
	}
	
	/**
	 */
	public void setImageNought()
	{
		this.setIcon(new ImageIcon(MainFrame.class.getResource(NOUGHT_PATH)));
		this.isAlreadyUsed = true;
	}
	
	/**
	 */
	public void setImageNone()
	{
		this.setIcon(null);
		this.isAlreadyUsed = false;
	}
}
