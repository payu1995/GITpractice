package practice_01_while_loop_program;

public class primenumber {
	public static void main(String[] args) {
		
	
	//program to check prime number
			int num = 15, i=2;
			boolean bool = false;
			
			while(i<=num/2) {
			
				//check prime number
				 
				if(i%num==0) { 
					bool = true;
					break;
				}
					++i;
		}
			
			if(!bool)
			System.out.println(num + "num is prime number " );
			else
			System.out.println(num + "num is not a prime number " );
			
	}
	}


