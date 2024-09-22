package exception_handling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=15,num2=0,res;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		try {
		 res=num1/num2;
		 System.out.println("Result : "+res);
		}catch(Throwable e) {
			System.out.println("Exception found and handled");
//			System.err.println("Exception message: "+e.getMessage());
//			System.err.println("Exception classname with message: "+e);
			e.printStackTrace();//actual exception with details
		}
		System.out.println("Program ends");
}
}