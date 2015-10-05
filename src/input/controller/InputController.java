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
	}
	
	public boolean pomptForAge()
	{
		boolean validInt = false;
		System.out.println("Please type in any number");
		String userInput;
		userInput = inputScanner.next();
		
		int numberValue;
		numberValue = Integer.parseInt(userInput);
		
		if(numberValue % 2 == 0)
		{
			System.out.println("You typed in a even number");
			validInt = true;
		}
		else if(numberValue % 2 != 0)
		{
			System.out.println("You did not type in a odd number");
		}
		return validInt;
	}
	
	public boolean promptForWeight()
	{
		boolean validDouble = false;
		System.out.println("Please type in your weight in decimal form");
		String tempUserInput;
		tempUserInput = inputScanner.next();
		
		double weightValue = Double.parseDouble(tempUserInput);
		
		if(weightValue != validDouble)
		{
			
		}
	}
	
}
