package notes;

public class Notes20_Aligned_Arrays {

	public static void main(String[] args) {
		
		String[] lastName = {"Hunter", "Granado", "Uglow"};
		String[] firstName = {"Robert", "Mark", "Sam"};
		boolean[] hasKids = {true, true, false};
		double[] heightFeet = {6.0, 5.9, 17.0};
		
		//list people with kids
		System.out.println("These people have kids");
		//loop throguh array
		for (int i = 0; i < hasKids.length; i++) {
			//check for kids
			if (hasKids[i]){
				System.out.println(lastName[i] + ", " + firstName[i]);
			}
			
			
		}
		System.out.println();
		
		
		
		//list people who are 6ft or taller
		System.out.println("These people are 6ft or taller");
		//loop throguh array
		for (int i = 0; i < heightFeet.length; i++) {
			//check for kids
			if (heightFeet[i] >= 6.0){
				System.out.println(lastName[i] + ", " + firstName[i]);
			}
		}
		System.out.println();
		
		
		
	}
	
	
}
