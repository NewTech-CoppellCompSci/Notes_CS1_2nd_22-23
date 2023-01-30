package notes;

/**
 * Notes:  STRING METHODS
 * 
 * String are NOT data types (int, double, char...).  So,
 * to manipulate them we must use methods.
 * 
 * Add the method like this
 *     <String>.methodName(<parameters>) 
 *
 * 
 * Methods:
 * 
 * .equals(<String>)
 * 	 Returns 
 * 		true if the String is EXACTLY the same as the parameter	
 *  	false otherwise
 * 
 * .equalsIgnoreCase(<String>)
 * 	 Return 
 * 		true if the String is EXACTLY the same as the parameter
 *           however, it does not compare upper/lower case.
 *  	false otherwise
 * 
 * .length()
 *   Return -> 
 *     
 *     
 * .substring(<int>)
 *   Return -> 
 * 
 * 
 * .substring(<int>, <int>)
 *	 Return -> 
 *
 *
 */

public class Notes16_String_Methods {
	
	public static void main(String[] args) {
		
		/*
		 * .length()
		 * returns the number of characters in a String
		 */
		System.out.println("hello there".length());
		
		String words = "Hi there funky whatever";
		System.out.println(words.length());
		
		System.out.println();
		System.out.println();
		
		//grabs index #3 to the end
		System.out.println("Hello".substring(3));
		
		
		//grabs 'e' to the end
		System.out.println("Hello".substring(1));
		
		System.out.println(words.substring(10));
		
		
		//grab last letter in "words" only
		System.out.println(words.substring(words.length() - 1));
		words = "xyz";
		System.out.println(words.substring(words.length() - 1));
		words = "Manchester United SUX!";
		System.out.println(words.substring(words.length() - 1));
		words = "fartknocker";
		System.out.println(words.substring(words.length() - 1));
		words = "hair... it's an inside joke";
		System.out.println(words.substring(words.length() - 1));
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		System.out.println("whatever".substring(3, 6));
		
		//grab the 1st character only
		System.out.println("whatever".substring(0, 1));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
