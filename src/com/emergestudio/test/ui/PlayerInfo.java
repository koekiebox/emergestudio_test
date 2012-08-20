package com.emergestudio.test.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * TODO **** None of the code may be changed in this class. ****
 * 
 * @author jasonbruwer
 */
public class PlayerInfo extends JDialog {

	/**
	 */
	private static final long serialVersionUID = 8709752289195012233L;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField player1Name;
	private JTextField player2Name;
	
	private boolean wasCancelAction = false;

	/**
	 * Create the dialog.
	 */
	public PlayerInfo() {
		setTitle("New Game Player Information");
		this.wasCancelAction = false;
		
		int height = 250;
		int width = 400;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		setBounds((d.width-width)/2, (d.height-height)/2, width, height);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		this.setModalityType(ModalityType.APPLICATION_MODAL);
		this.setModal(true);
		
		JLabel lblPlayerName = new JLabel("Player 1 Name:");
		lblPlayerName.setBounds(31, 28, 117, 16);
		contentPanel.add(lblPlayerName);
		
		JLabel lblPlayerName_1 = new JLabel("Player 2 Name: ");
		lblPlayerName_1.setBounds(31, 70, 117, 16);
		contentPanel.add(lblPlayerName_1);
		
		player1Name = new JTextField();
		player1Name.setBounds(160, 22, 185, 28);
		contentPanel.add(player1Name);
		player1Name.setColumns(10);
		
		player2Name = new JTextField();
		player2Name.setColumns(10);
		player2Name.setBounds(160, 64, 185, 28);
		contentPanel.add(player2Name);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okAction();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelAction();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	/**
	 */
	private void cancelAction()
	{
		this.wasCancelAction = true;
		this.dispose();
	}
	
	/**
	 * 
	 */
	private void okAction()
	{
		if(this.player1Name.getText().trim().isEmpty() || 
				this.player2Name.getText().trim().isEmpty())
		{
			//custom title, error icon
			JOptionPane.showMessageDialog(this,
			    "Must provide both player names.",
			    "No player names",
			    JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		this.dispose();
	}
	
	/**
	 * @return
	 */
	public String getPlayerOneName()
	{
		return this.player1Name.getText();
	}
	
	/**
	 * @return
	 */
	public String getPlayerTwoName()
	{
		return this.player2Name.getText();
	}

	/**
	 * @return the wasCancelAction
	 */
	public boolean isWasCancelAction() {
		return this.wasCancelAction;
	}
}
