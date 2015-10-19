package input.controller;

import java.util.Scanner;

public class InputController 
{
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		pomptForAge();
		promptForWeight();
		promptForName();
		isHuman();
	}
	
	public boolean pomptForAge()
	{
		boolean validInt = false;
		System.out.println("Please type in a number");
		String userInput;
		userInput = inputScanner.next();
		
		int numberValue;
		numberValue = Integer.parseInt(userInput);
		
		if(numberValue % 2 == 0)
		{
			System.out.println("You typed in an even number");
			validInt = true;
		}
		else if(numberValue % 2 != 0)
		{
			System.out.println("You typed in an odd number.");
		}
		return validInt;
	}
	
	public boolean promptForWeight()
	{
		boolean validDouble = false;
		System.out.println("Please type in your weight.");
		String tempUserInput;
		tempUserInput = inputScanner.next();
		
		double weightValue = Double.parseDouble(tempUserInput);
		
		if((weightValue * 10) % 2 == 0)
		{
			System.out.println("You did not type in your weight with a decimal");
			validDouble = false;
		}
		else if((weightValue-(int)weightValue) != 0)
		{
			System.out.println("You typed in a decimal!");
			validDouble = true;
		}
		return validDouble;
	}
	
	public boolean promptForName()
	{
		boolean validName = false;
		System.out.println("Please type in a name greater than 7 letters.");
		String userName;
		userName = inputScanner.next();
		
		if(userName.length() > 7)
		{
			System.out.println("Good job. You typed in " + userName + " which is greater than 7 letters");
			validName = true;
		}
		else if(userName.length() <= 7)
		{
			System.out.println("Error: please type in a name greater than 7 lettes");
			validName = false;
		}
		return validName;
	}
	
	public boolean isHuman()
	{
		boolean isHuman = false;
		System.out.println("Are you human y/n");
		String input;
		input = inputScanner.next();
		
		if(input.equals("y"))
		{
			System.out.println("You are human");
			isHuman = true;
		}
		else if(input.equals("n"))
		{
			System.out.println("You are not a human");
			isHuman = false;
		}
		return isHuman;
	}
	

	
}






