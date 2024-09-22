package exception_handling;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		int num1 = 15, num2 = 0;
		System.out.println("number num1 :" + num1);
		System.out.println("number num1 :" + num2);
try {
		int res = num1 / num2;
		System.out.println("result : " + res);
}catch(Throwable e){
	
	System.out.println("Exception found and handle");
	System.err.println("Exception found message: " + e.getMessage());
	System.err.println("Exception classname with message: " + e);
e.printStackTrace();//actual exception
	}
System.out.println("program end");
	}
}


