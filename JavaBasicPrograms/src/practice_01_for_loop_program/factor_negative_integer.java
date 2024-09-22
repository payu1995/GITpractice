package practice_01_for_loop_program;

public class factor_negative_integer {
	

	public static void main(String[] args) {
		//factor of negative integer
		  
		 int n = -30; 
		 for(int i =1; i>=n; i--) {
		  
		  if(i==0) {
			  continue;
			  }
		  else {
			  if (n%i==0) {
			   System.out.println(i );
		  }
		 
	}
		 }
	}
}

		 
	
