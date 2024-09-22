package exception_handling;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		 
		System.out.println("Program starts");
		int[] num=new int[3];
		try {
			System.out.println(num[3]);
		}catch(ArithmeticException e) {
			System.out.println("Exception found and handled");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception found and handled");
		}catch(Exception e) {
			System.out.println("Exception found and handled");
		}catch(Throwable e) {
			System.out.println("Exception found and handled");
		}
		System.out.println("Program ends");
	}

}
