package exception_handling;



class ShaileshException1 extends Exception{
	ShaileshException1(String str){
		super(str);
	}
}
public class CustomException2 {

	public static void main(String[] args) {

		System.out.println("Program starts");
		try {
			checkAge(17);
		} catch (ShaileshException1 e) {
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}
	static void checkAge(int age) throws ShaileshException1 {
		if(age>18) {
			System.out.println("Welcome to FB, create your account");
		}else {
			throw new ShaileshException1("Not eligible, due to age validation failed");
		}
	}
}
