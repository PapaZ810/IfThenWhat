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
	 * this is the input method which asks you a bunch of question about your game session
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
	
	/**
	 * This is the start method of my program 
	 * it calls the input() method and the arrrrrrrrrrrrrrrr() method 
	 * it also has a for loop that calls the methods
	 * inside the for loop there are if loops that change the suffix 
	 * on the number of time you have entered you info into the input method
	 */
	
	public void start()
	{
		for (int inputLoop = 1; inputLoop >= 4; inputLoop++)
		{
			String numberSuffix = "nd";
			
			if (inputLoop == 1 || inputLoop == 21)
				numberSuffix = "st";
			
			if (inputLoop == 3 || inputLoop == 23)
				numberSuffix = "rd";
			
			if (inputLoop == 4 || inputLoop == 5 || inputLoop == 6 || inputLoop == 7 || inputLoop == 8 || 
					inputLoop == 9 || inputLoop == 10 || inputLoop == 11 || inputLoop == 12 || inputLoop ==  13 || 
					inputLoop == 14 || inputLoop == 15 || inputLoop == 16 || inputLoop == 17 || inputLoop == 18 || 
					inputLoop == 19 || inputLoop == 20 || inputLoop == 24)
				numberSuffix = "th";
			
			input();
			
			JOptionPane.showMessageDialog(null, "This is the " + inputLoop + numberSuffix + " time you did it!");
		
			arrrrrrrrrrrrrrrr();
		}
	}
	
	/**
	this method holds the array list and a for loop for the array list
	the list adds a uni and a unimem then removes the unimem
	*/
	
	public void arrrrrrrrrrrrrrrr()
	{
		for(int arr = 0; arr >= 2; arr ++)
		{
			ArrayList<String> Session = new ArrayList<String>();
			{
				Session.add("uni");
				Session.add(1,"unimem");
			
				Session.remove(1);
			}
		}
	}
}

