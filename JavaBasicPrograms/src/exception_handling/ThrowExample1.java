package exception_handling;

public class ThrowExample1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		checkAge(17);
		System.out.println("Program ends");
	}

	static void checkAge(int age) {
		if(age>18) {
			System.out.println("Welcome to FB, create your account");
		}else {
			throw new ArithmeticException("Not eligible, due to age validation failed");
		}
	}
}