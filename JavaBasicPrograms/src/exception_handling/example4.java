package exception_handling;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program starts");
		int[] num=new int[3];
		try {
			num[3]=10/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception found and handled: "+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Exception found and handled: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception found and handled: "+e.getMessage());
		}catch(Throwable e) {
			System.out.println("Exception found and handled: "+e.getMessage());
		}
		System.out.println("Program ends");
	}

}