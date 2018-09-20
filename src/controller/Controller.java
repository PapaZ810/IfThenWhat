package controller;

import model.GameSession;
import javax.swing.JOptionPane;

public class Controller
{
	/**
	 * Builds the instance
	 */
	
	private JOptionPane userInput;
	private GameSession userSession;
	
	
	public Controller()
	{
		
	}
	/**
	 * where the program starts calling methods
	 */
	public void start()
	{
		
		String userInput = JOptionPane.showInputDialog(null,"");
		int timeMinutes;
		if (validInt(userInput))
		{
			timeMinutes = Integer.parseInt(userInput);
		}
		userSession.setTimeMinutes(timeMinutes);
		
		userInput = JOptionPane.showInputDialog(null, "");
		
		
		
		
		
		
		
		
	}


	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number!");
		}
		return isValid;
	}
}
