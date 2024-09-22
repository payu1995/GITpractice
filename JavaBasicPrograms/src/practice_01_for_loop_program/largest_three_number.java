package practice_01_for_loop_program;

public class largest_three_number {
public static void main(String[] args) {
	// find largest among three number using if...... else statement
	
		double n1= -5.5, n2=4.9, n3= 3.9;
		
		if (n1>=n2 && n1>=n3)
		System.out.println(n1 + "is the largest number");
		
		else if (n2>=n1 && n2>=n3)
		System.out.println(n2 + "is the largest number");
		 
		
		else
		System.out.println(n3 + "is the largest number");
		

	}
			
}

