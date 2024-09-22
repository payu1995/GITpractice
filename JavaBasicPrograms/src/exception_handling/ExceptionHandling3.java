package exception_handling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		 
		System.out.println("Program starts");
		int[] num=new int[3];
		try {
			System.out.println(num[0]);//no exception, catch block won;t be executed
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception found and handled");
		}
		System.out.println("Program ends");
	}

}
