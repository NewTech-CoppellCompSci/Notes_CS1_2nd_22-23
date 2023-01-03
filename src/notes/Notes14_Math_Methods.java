package notes;

import java.util.Scanner;

/*
 * Math Methods
 * 
 * ALLLL SOORts of this to make life easier
 * 
 * 
 * 
 */

public class Notes14_Math_Methods {

	public static void main(String[] args) {
		
		/*
		 * Math.pow(<base>, <exponent>) -> <double>
		 */
		
		System.out.println("2^4 = " + Math.pow(2, 4));
		System.out.print("As an integer: ");
		System.out.println("2^4 = " + (int) Math.pow(2, 4));
		
		//Type cast it to an integer if you need to!
		int x = (int) Math.pow(2.5, 4);
		System.out.println("\n");
		
		double a1 = 5, a2 = 3.1, a3 = -2;
		System.out.println("a1^a2 = " + Math.pow(a1, a2) + "\n");
		System.out.println("a2^a3 = " + Math.pow(a2, a3) + "\n");
		System.out.println("a3^(a1 + a3) = " + Math.pow(a3, a1 + a3) + "\n");
		
		System.out.println("\n");
		
		
		/*
		 * Math.sqrt(<num>) -> <double> (Mostly)
		 */
		
		System.out.println("sqare root of 9 = " + Math.sqrt(9));
		System.out.println("sqare root of 17 = " + Math.sqrt(17));
		System.out.println("sqare root of 4.1 = " + Math.sqrt(4.1));
		
		
		
		
		
		/*
		 * Math.max(<num>, <num>) -> <int> or <double>
		 * Math.min(<num>, <num>) -> <int> or <double>
		 * 
		 * 
		 * 
		 */
		System.out.println("\n");
		System.out.println("Max of 9 and 15 = "+ Math.max(9,  15));
		
		System.out.println("\n");
		//show the max of 5 inputs
		int max = Integer.MIN_VALUE; //start as low as possible so it goes up from there
		int input = 0;
		
		Scanner inKey = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			
			//compare current input with current max
			max = Math.max(max, input);
			
		}
		System.out.println("Max input = " + max);
		
		
	}
	
	
	
	
}
