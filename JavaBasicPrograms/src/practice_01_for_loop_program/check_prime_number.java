package practice_01_for_loop_program;

public class check_prime_number {
	public static void main(String[] args) {
		//check prime number using for loop
		
		
				int num = 29;
				boolean bool = true;
				
				for(int i=2; i<=num/2 ; i++) {
					//not prime number 
					
					if (num % i ==0) {
						bool = false;
						
					}
					if(!bool) 
					System.out.println(num  + "  is prime number.");
					}
					
					System.out.println(num +" is not prime number.");
					
	}

}
