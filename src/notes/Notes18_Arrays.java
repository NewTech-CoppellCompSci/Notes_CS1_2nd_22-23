package notes;

/*
 * Notes - Arrays
 * 
 * Basically if a variable is a shoe box, then an array is a shoe store
 * 
 */


public class Notes18_Arrays {

	public static void main(String[] args) {
		
		
		//declaring an array (default values)
		int[] nums1 = new int[5];  //currently holds 5 default values 0
		String[] words1 = new String[10]; //currently holds 10 default values ""
		
		//declare with given values
 		int[] nums2 = {5, 6 ,-4 ,15 ,25, 6 ,15, -5486};
 		String[] words2 = {"hello", "chicken", "Willikins"}; 
		
		//NO  You CAN NOT change the size of an array.
 		//But you can change the values
 		
 		System.out.println( nums1[1]  );
		nums1[1] = 24;
 		System.out.println( nums1[1]  );
		nums1[1] = nums1[1] + nums2[2] * nums2[0]; 
 		System.out.println( nums1[1]  );
 		
 		System.out.println(nums1);
 		System.out.println(nums2);
		nums1[4] = 1234;
		System.out.println(nums1);
		
		String str = "hi";
		str.length();
		System.out.println();
		//traversing arrays
		for (int i = 0; i < words2.length; i++) {
			System.out.println( words2[i] );
			
		}
		
		int x = words2.length;
		int y = words2[1].length();
		int z = nums1.length;
		
		
		
		
		
		
		
	}

}
