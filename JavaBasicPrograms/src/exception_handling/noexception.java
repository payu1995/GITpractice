package exception_handling;

public class noexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		int[] num = new int[3];
		
		try {

			System.out.println(num[0]);//no eception catch block wont executed
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception found and handle");

		}
		System.out.println("program end");

	}

	}


