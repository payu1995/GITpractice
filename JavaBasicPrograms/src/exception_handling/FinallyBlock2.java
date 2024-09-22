package exception_handling;

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program starts");
		int num1=15,num2=0,res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		try {
		 res=num1/num2;
		 System.out.println("Result : "+res);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception found and handled");
			e.printStackTrace();//actual exception with details
		}finally {
			System.out.println("**********I am finally block****************");
		}
		System.out.println("Program ends");
	}
}