package model;

public class GameSession
{
	private int timeMinutes, timeHours, inGameKills;
	private String name;
	
	/**
	 * default constructor for GameSession
	 * initialize all variables to valid but bad values
	 * used for later customization
	 */

 	public GameSession()
	{
		this.name = "unnamed game session";
		this.timeMinutes = -99;
		this.timeHours = -99;
		this.inGameKills = -99;
	}
	
 	
 	/**
	public GameSession(String name)
	{
		this.name = name;
	}
	*/
 	public String getName()
	{
		return name;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	
	public int getTimeHours()
	{
		return timeHours;
	}
	
	public int getInGameKills()
	{
		return inGameKills;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	
	public void setTimeHours(int timeHours)
	{
		this.timeHours = timeHours;
	}
	
	public void setInGameKills(int inGameKills)
	{
		this.inGameKills = inGameKills;
	}

	public String toString()
	{
		String description = "In your session called " + name + " you spent " + timeHours + " hours "
				+ "and " + timeMinutes + " minutes and killed " + inGameKills + "! Good job!";
		
				
		return description;		
	}





}

