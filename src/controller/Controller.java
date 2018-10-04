package controller;

import model.GameSession;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controller
{
	/**
	 * Builds the instance
	 */
	
	private GameSession userSession;
	
	/**
	private void looper()
	{
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 0;
		while(!isFinished)
		{
			someCount++;
			System.out.println("why");
			if (someCount >= 10)
			{
				isFinished = true;
			}
		}
	}
	*/
	
	public Controller()
	{
		userSession = new GameSession();
	}
	/**
	 * where the program starts calling methods
	 */
	public void input()
	{
		//looper();	
		
		String userInput = JOptionPane.showInputDialog(null, "How many hours did you play rounded to the nearest hour?");
		int timeHours = -99;
		if (validInt(userInput))
		{
			timeHours = Integer.parseInt(userInput);
		}
		userSession.setTimeHours(timeHours);
		
		userInput = JOptionPane.showInputDialog(null,"How many extra minutes did you play the game?");
		int timeMinutes = -99;
		if (validInt(userInput))
		{
			timeMinutes = Integer.parseInt(userInput);
		}
		userSession.setTimeMinutes(timeMinutes);
		
		userInput = JOptionPane.showInputDialog(null,"How many kills did you get?");
		int inGameKills = -99;
		if (validInt(userInput))
		{
			inGameKills = Integer.parseInt(userInput);
		}
		userSession.setInGameKills(inGameKills);
		
		userInput = JOptionPane.showInputDialog(null,"What do you want to call this session?");
		String name = userInput;
		userSession.setName(name);
	
		
		//JOptionPane.showMessageDialog(null, "In your session called " + userSession.getName() + " you spent " + userSession.getTimeHours() + " hours and " + userSession.getTimeMinutes() + " minutes and killed " + userSession.getInGameKills() + "! Good job!");
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

	public void start()
	{
		for (int inputLoop = 1; inputLoop >= 4; inputLoop++)
		{
			String numberSuffix = "nd";
			
			if (inputLoop == 1)
				numberSuffix = "st";
			
			if (inputLoop == 3)
				numberSuffix = "rd";
			
			if (inputLoop == 4 || inputLoop == 5 || inputLoop == 6 || inputLoop == 7 || inputLoop == 8 || inputLoop == 9 || inputLoop == 10 || inputLoop == 11 || inputLoop == 12 || inputLoop ==  13 || inputLoop == 14 || inputLoop == 15 || inputLoop == 16 || inputLoop == 17 || inputLoop == 18 || inputLoop == 19 || inputLoop == 20)
				numberSuffix = "th";
			
			input();
			
			JOptionPane.showMessageDialog(null, "This is the " + inputLoop + numberSuffix + " time you did it!");
		}
	}
}

