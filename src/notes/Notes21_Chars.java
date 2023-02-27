package notes;

import java.util.Arrays;

/*
 * Notes Chars
 * 
 * Char is a variable that holds 1 character
 * 
 * Stored as an integer
 * 
 * 
 */

public class Notes21_Chars {

	public static void main(String[] args) {
		
		char let1 = 'a';  //chars get single quotes
		char let2 = 97;   //# for an a
		System.out.println(let1);
		System.out.println(let2);
		
		
		
		let1 += 1;
		System.out.println(let1);
		System.out.println((char) (let1 / 2 + 3) );
		
		//I don't have to use .equals()
		//see if let1 has a 'b' in it
		if (let1 == 'b') {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		
		/*
		 * .charAt(<int>)
		 * 
		 * A String method that returns the given
		 * index as a char
		 */
		
		String str = "Hi Ho Willikins!";
		char letter = str.charAt(5);
		System.out.println(letter);
		
		for (int i = 0; i < str.length(); i++) {
			
			//same as
			//str.substring(i, i+1).equals("i")
			if (str.charAt(i) == 'i') {
				System.out.println("index = " + i);
			}
			
		}
		
		
		
		//Create a char[] from a string
		//.toCharArray()
		
		char[] message = str.toCharArray();
		System.out.println(Arrays.toString(message));
		
		
		System.out.println(str  + " = " + hasSpace(str));
		System.out.println("Boo!"  + " = " + hasSpace("Boo!"));
		
		
		
		
	}
	
	//if str contains a space it returns true
	public static boolean hasSpace(String str) {
		
		char[] letters = str.toCharArray();
		
		//Google "For Each Java" for an explanation
		for (char c : letters) {
			if (c == ' ') {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
