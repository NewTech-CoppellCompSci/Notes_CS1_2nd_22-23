package notes;

/*
 * Traversing Strings
 * 
 * Basically looping through a string 1 or more 
 * characters at a time
 * 
 */



public class Notes17_String_Traversing {

	public static void main(String[] args) {
		
		String str = "Hey Willikins!";
		
		//print each character of str an a different line
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println( str.substring(i, i + 1) );
			
		}
		System.out.println("\n");
		
		
		//what if I need 2 characters at a time
		for (int i = 0; i < str.length() - 1; i++) {
			
			System.out.println( str.substring(i, i + 2) );
			
		}
		System.out.println("\n");
		
		
		
		/*
		 * Looking for Stuff...
		 */
		
		
		//count the e's in str2
		String str2 = "Hey there everybody, why the long faces?";
		int count = 0;  //holds the count
		for (int i = 0; i < str2.length(); i++) {
			
			if (str2.substring(i, i + 1).equals("e")) {
				System.out.println("Found one at index " + i);
				count++;
			}
			
		}
		
		System.out.println("count = " + count);
		System.out.println("\n");
		
		
		
		/*
		 * Changing individual letters in a string
		 * 
		 * you physically rebuild the string from the beginning
		 */
		
		//change all e's in str2 to l's and l's to e's
		str2 = "Hey there everybody, why the long faces?";
		String newStr2 = "";
		for (int i = 0; i < str2.length(); i++) {
			
			//is it an e?
			if (str2.substring(i, i + 1).equals("e")) {
				//add l to newStr2
				newStr2 += "l";
			}
			//is it an l?
			else if (str2.substring(i, i + 1).equals("l")) {
				//add e to newStr2
				newStr2 += "e";
			}
			//is it NOT an e
			else {
				//add whatever is at that spot to newStr2
				newStr2 += str2.substring(i, i + 1);
				
			}
			
		}
		System.out.println(str2);
		System.out.println(newStr2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
