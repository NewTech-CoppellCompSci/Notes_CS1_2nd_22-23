package notes;

import java.util.Scanner;

/*
 * Notes: Nested Loops
 * 
 * 
 * Outer Loop {
 * 
 * 		Inner Loop {
 * 
 * 
 * 		}
 * 
 * }
 * 
 * 
 */

public class Notes13_Nested_Loops {

	public static void main(String[] args) {
		
		//How many times does the inner loop run?
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
			
		}
		System.out.println("total = " + count);
		
		System.out.println("\n\n");
		
		
		/*
		 * Outer loop: rows
		 * Inner Loop: columns
		 */
		System.out.println("Outer Loop = Rows");
		System.out.println("Inner Loop = Columns");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" i = " + i + "  j = " + j + "  | ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		
		
		
		System.out.println("Print a 5x7 box of #s");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n\n");
		
		
		/*
		 * Same as above but use user inputs
		 */
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = inKey.nextInt();
		System.out.print("Enter the width: ");
		int width = inKey.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n\n");
		
		
		
		/*
		 * Print Triangle
		 *    🐒
		 *   🐒🐒
		 *  🐒🐒🐒
		 * 🐒🐒🐒🐒
		 */
		/*
		 * Print Triangle
		 *    #
		 *   ##
		 *  ###
		 * ####    
		 */
		for (int i = 0; i < 4; i++) {
			//for spaces
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			
			//for Willikins
			for (int j = 0; j < 1 + i; j++) {
				System.out.print("🐒");
			}
			
			System.out.println();
			
		}
		for (int i = 0; i < 4; i++) {
			//for spaces
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			
			//for Willikins
			for (int j = 0; j < 1 + i; j++) {
				System.out.print("#");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		System.out.println("\n\nfin....");

	}

}
