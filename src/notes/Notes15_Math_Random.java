package notes;

import java.util.Scanner;

/*
 * Math.random() Notes
 * 
 * Math.random()
 */

public class Notes15_Math_Random {

	public static void main(String[] args) {
		
		/*
		 * Math.Random() -> Double
		 *   0 <= x < 1
		 * 
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		System.out.println();
		
		
		/*
		 * (int) (Math.random() * scope) + min
		 * 
		 * 		scope = how many numbers to choose from
		 * 		min   = what's the lowest number
		 */
		
		System.out.println("Random numbers from 1 to 10 inclusive" );
		for(int i = 0 ; i < 20; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
		}
		
		System.out.println("\n");
		System.out.println("Random numbers from 8 to 25 inclusive" );
		for(int i = 0 ; i < 20; i++) {
			int x = (int) (Math.random() * 18) + 8;
			System.out.println(x);
		}
		
		System.out.println("\n");
		System.out.println("Random numbers from -5 to 10 inclusive" );
		for(int i = 0 ; i < 20; i++) {
			int x = (int) (Math.random() * 16) - 5;
			System.out.println(x);
		}
		
		
		/*
		 * Scope
		 * How to calculate
		 * 
		 * What if I get a max and min
		 * 
		 * max = 20
		 * min = 10
		 * 
		 * scope = max - min + 1
		 * 
		 */
		Scanner inKey = new Scanner(System.in);
		System.out.print("\nEnter bottom int = ");
		int min = inKey.nextInt();
		System.out.print("Enter top int = ");
		int max = inKey.nextInt();
		
		System.out.println("20 numbers from " + min + " to " + max);
		for(int i = 0 ; i < 20; i++) {
			int x = (int) (Math.random() * (max - min + 1)) + min;
			System.out.println(x);
		}
		
		
	}
	
}
