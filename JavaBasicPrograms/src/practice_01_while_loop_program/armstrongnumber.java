package practice_01_while_loop_program;

public class armstrongnumber {
	public static void main(String[] args) {
		
	
	//check armstrong number for 3 digit number
	
	int number = 371, originalNumber, reminder,result=0;
	originalNumber = number;

	while(originalNumber!=0) {
			
		reminder=originalNumber%10;
		result += Math.pow(reminder,3);
		originalNumber /= 10;
	}
		if(result==number)
			System.out.println(number + " is amstrong number");
		else
		System.out.println(number + " is not amstrong number");
	}
		}


