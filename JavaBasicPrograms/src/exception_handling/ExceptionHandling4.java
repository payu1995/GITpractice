package exception_handling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		 
		System.out.println("Program starts");
		int[] num=new int[3];
		try {
			System.out.println(num[3]);//exception occurred but not handled by catch block. program will be terminated
		}catch(ArithmeticException e) {
			System.out.println("Exception found and handled");
		}
		System.out.println("Program ends");
	}

}
