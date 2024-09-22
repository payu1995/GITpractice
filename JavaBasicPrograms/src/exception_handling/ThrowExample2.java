package exception_handling;

public class ThrowExample2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		try {
		checkAge(17);
		}catch(Throwable e) {
			System.out.println(e);
		}
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