/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock.paper.scissors.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joeyvalencia
 */
public class RockPaperScissors2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Random number generator */
		Random random = new Random();
		
		/* Scanner object for input */
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Integer variables to hold the user and computer choice.
		 * 
		 * 0 = Rock
		 * 1 = Paper
		 * 2 = Scissors
		 * 
		 */
		int userChoice, computerChoice;
		
		// Showing prompt and user input
		System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors):");
		userChoice = scanner.nextInt();
		
		// Checking if userChoice is 0, 1, or 2.
		if(userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice. Ending program.");
			
			// Exit program
			System.exit(0);
		}
		
		// Generating random computer choice
		computerChoice = random.nextInt(3);
		
		// Determining the winner
		
		// If the choices are equal, it's a tie.
		if(userChoice == computerChoice)
		{
			if(userChoice == 0)
			{
				System.out.println("Both players chose rock!");
			}
			else if (userChoice == 1)
			{
				System.out.println("Both players chose paper!");
			}
			else
			{
				System.out.println("Both players chose scissors!");
			}
			
			// Exit program
			System.exit(0);
		}
		
		if(userChoice == 0)		// User chooses rock
		{
			if(computerChoice == 1)
			{
				System.out.println("You chose rock; Computer chose paper");
				System.out.println("Computer wins!");
			}
			else
			{
				System.out.println("You chose rock; Computer chose scissors");
				System.out.println("You win!");
			}
		}
		else if(userChoice == 1)	// User chooses paper
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose paper; Computer chose rock");
				System.out.println("You win!");
			}
			else
			{
				System.out.println("You chose paper; Computer chose scissors");
				System.out.println("Computer wins!");
			}
		}
		else	// User chooses scissors
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose scissors; Computer chose rock");
				System.out.println("Computer wins!");
			}
			else
			{
				System.out.println("You chose scissors; Computer chose paper");
				System.out.println("You win!");
			}
		}
		
		scanner.close();
    }
    
}
