package exception_handling;

public class example3 {

	public static void main(String[] args) {
		System.out.println("program start");
		int[] num = new int[3];
		
		try {

			System.out.println(num[3]);//exception occureed but not handle by cathch by prrm terminate
		} catch (ArithmeticException e) {

			System.out.println("Exception found and handle");

		}
		System.out.println("program end");

	}
}
