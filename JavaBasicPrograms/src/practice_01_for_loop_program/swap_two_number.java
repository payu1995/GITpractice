package practice_01_for_loop_program;

public class swap_two_number {
public static void main(String[] args) {
	// swap two number using temporary variable
	  
	  int x = 100, y = 200;
	  // before swapping
	 
	 System.out.println("x is :" + x); 
	 System.out.println("y is :" + y);
	 
	  // after swapping
	
	  int temp = x; x= y; y=temp; 
	  System.out.println("x is :" + x);
	  System.out.println("y is :" + y);
	 
}
}
