package practice_02_star_pattern;

public class half_pyramid_alphabet {

	public static void main(String[] args) {
		
		
		char ch='A';
		
		for(int i=1; i<=5; i++) {
			//ch='A';
			for (int j=1; j<=i; j++) {
				
				System.out.print(ch+ "  ");
				//ch++;	
			}
			System.out.println();
			ch++;
		}

	}

}
