
package static_global_variable_acess_modifier;

public class practice_problem_prime_number {
	public static void main(String[] args) {
		// wap prime number in given a range

		primeNumber(29);

	}

	static void primeNumber(int num) {

		int num1 = 29;
		boolean bool = true;
		for (int i = 2; i <= num / 2; i++) {

			// not prime number
			if (num % 2 == 0) {
				bool = false;

			}
			if (!bool) {

				System.out.println(num + " number is prime number");
			}

			System.out.println(num + " number is not prime number");

		}
	}
}
