package static_global_variable_acess_modifier;

public class practice_problem_02_reverseNumber {
	public static void main(String[] args) {
		reverseNumber(10);
		
		// System.out.println("reverse the number: " + i);
	}

	// write a program reverse number of given number
	static void reverseNumber(int n) {

		// int n =10;
		for (int i = 10; i >= 1; i--) {
			System.out.println("reverse the number: " + i);

		}
	}
}