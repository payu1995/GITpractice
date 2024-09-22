package static_global_variable_acess_modifier;

public class practice_problem02_factor_any_number {
	public static void main(String[] args) {

		factorNumber(30);

		// System.out.println( "factor of given number :" + "n");
	}

	static void factorNumber(int i) {
		int n = 30;

		for (int i1 = 1; i1 <= n; i1++) {
			if (n % i1 == 0) {
				System.out.println("factor of given number :" + i1);
			}
		}
	}
}
