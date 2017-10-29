//Nathan Blausey
//Date: 10/28/2017
// Week06 Homework

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Even_Game
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		boolean g = false;
		int games = 0;
		int gamesWon = 0;
		int evens = 0;
		int odds = 0;
		double percent = 0;
		ArrayList<String> stats = new ArrayList<String>();
		
		while (!g)
		{
			int computerNum;
			computerNum = 1 + (int) (Math.random() * 6);
			
			boolean compEven = (computerNum % 2 == 0)? true : false;
			
			if (compEven)
				evens++;
			else
				odds++;				
				
			//System.out.println(computerNum);

			String player;
			System.out.println("Is the number Odd or Even?");
			System.out.println("O = Odd and E = Even: ");
			player = input.next().toUpperCase();
			
			boolean playerEven=(player.equals("E"))? true: false;
			
			System.out.println(player);
			
			if (!player.equals("E") && !player.equals("O"))
			{
				System.out.println("Invalid Input");
			}
			else if (playerEven == compEven)
			{
				System.out.println("You Win");
				stats.add("Win");
				
				gamesWon++;
			} 
				else
			{
				System.out.println("You Lose");
				stats.add("Lose");
			}

					
			games++;
			
			percent = (double) gamesWon / games * 100;
			
			System.out.printf("You've played %d nuumber of times.%n", games);
			System.out.printf("The system has generated %d number of Odds and %d number of Evens%n", odds, evens);			
			System.out.printf("Your winning percentage is %f%%%n", percent);

			String replay;
			System.out.println("Would you Like to play again?");
			System.out.print("Y = Yes and N = No: ");
			replay = input.next();
			
			g = (replay.toUpperCase().equals("Y")) ? false : true;
			

		}
		
		System.out.println("Game history:");
		for (int i=0; i< games; i++)
		{
			System.out.printf ("Game %d: %s/n", i+1, stats.get(i));
		}
	}
}


