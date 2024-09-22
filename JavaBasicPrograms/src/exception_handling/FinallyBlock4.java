package exception_handling;

public class FinallyBlock4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=15,num2=5,res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		try {
		 res=num1/num2;
		 System.out.println("Result : "+res);
		}catch(ArithmeticException e) {
			System.out.println("Exception found and handled");
			e.printStackTrace();//actual exception with details
		}finally {
			res=num1/0;//due to this finally won;t be executed
			System.out.println("**********I am finally block****************");
		}
		System.out.println("Program ends");
	}

}