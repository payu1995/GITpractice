package exception_handling;

class ShaileshException extends Exception{
	ShaileshException(String str){
		super(str);
	}
}
public class CustomException1 {
	public static void main(String[] args) throws ShaileshException {
		System.out.println("Program starts");
		checkAge(17);
		System.out.println("Program ends");
	}
	static void checkAge(int age) throws ShaileshException {
		if(age>18) {
			System.out.println("Welcome to FB, create your account");
		}else {
			throw new ShaileshException("Not eligible, due to age validation failed");
		}
	}
}


