package notes;

import java.util.Scanner;

public class Notes03_Scanners {
	public static void main(String[] args) {
		/*
		 * Scanner
		 * 
		 * This is how we take input from the anything
		 * - keyboard
		 * - mouse
		 * - file
		 * 
		 * 
		 * 2 parts
		 * 		1 - create the Scanner object (only once)
		 * 		2 - use the object to scan as many times necessary
		 * 
		 * 
		 * .next() - grabs up to a space or return
		 * .nextLine() - grabs up to a return
		 * .nextInt() - grabs the next input as an integer
		 * .nuxtDouble() - grabs the next input as an double
		 */
			
		
		//ONCE ONLY!!!
		Scanner inKey = new Scanner(System.in);
		
		/*
		 * Scanning a full line
		 */
		//Prompt
		System.out.print("Enter Favorite Barbie Movie: ");
		//Scan
		String favoriteMovie = inKey.nextLine();
		//Use it
		System.out.println("You really like " + favoriteMovie + 
				"?  \nI knew something was wrong with you!!\n");
		
		
		//DO NOT RECREATE THE SCANNER!!!
		//Unless you're in a new method
		
		//Prompt
		System.out.print("What did Willikins do that got him killed? ");
		//Scan
		String greatDeath = inKey.nextLine();
		//Use it
		System.out.println("He really " + greatDeath + "?\n");

		
		/*
		 * Scanning only 1 word
		 */
		//Prompt
		System.out.print("What is Willikins last name? ");
		//Scan
		String nameLast = inKey.nextLine();
		//Use it
		System.out.println("He really " + nameLast + "?\n");
		
		
		/*
		 * Scanning an Integer
		 */
		//Prompt
		System.out.print("When did Willikins die? ");
		//Scan
		int wilikinsDeath = inKey.nextInt();
		//Use it
		System.out.println("he died in " + wilikinsDeath + "\n");

		
		/*
		 * Scanning a Decimal
		 */
		//Prompt
		System.out.print("How much money was on Wilikins dead body? ");
		//Scan
		double wilikinsDeathPrice = inKey.nextDouble();
		//Use it
		System.out.println("He had " + wilikinsDeathPrice + " on him.");

		

	}
}
