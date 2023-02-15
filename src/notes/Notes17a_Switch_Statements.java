package notes;

import java.util.Scanner;

public class Notes17a_Switch_Statements {

	
	public static void main(String[] args) {
		
		/*
		 * Switch Statements
		 * 
		 * Similar to if's, but much cleaner.
		 * 
		 * Differences
		 * 		No ranges, discrete only (<, >, <=, >=)
		 * 		No decimals
		 * 		Only looks at 1 variable
		 * 
		 */
		
		
		
		Scanner inKey = new Scanner(System.in);
		
		boolean validResponse = false;
		
		while (!validResponse) {
			System.out.println("Enter a number from 1 - 10");
			int num = inKey.nextInt();
		
			//say if num is prime (1-10) only.
			switch (num) {
			case 2:  
			case 3: 
			case 5:
			case 7:
				System.out.println("That's prime");
				validResponse = true;
				break;
			
			case 1: case 4: case 6: case 8: case 9: case 10:
				System.out.println("That's composite");
				validResponse = true;
				break;
			default:
				System.out.println("Try again stilly");
			
			}
			
			System.out.println("\n  fin...");
		}
		
		
		
		
		
		
		
		
	}
	
}
