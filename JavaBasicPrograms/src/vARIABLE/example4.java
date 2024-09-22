package vARIABLE;

public class example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaration and initialization
		int num1=10;
		int num2=5;
		int result=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Addition of two numbers: "+result);
		System.out.println("***************************");
		//re-initialization
		result=num1-num2;
		System.out.println("Subtraction of two numbers: "+result);
		System.out.println("***************************");
		//TODO: multi, div & mod
		//re-initialization of num1, num2 & result
		num1=25;
		num2=10;
		result=num1*num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Multi of two numbers: "+result);
		System.out.println("***************************");
		//re-initialization of num2 & result
		num2=5;
		result=num1/num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Div of two numbers: "+result);
		System.out.println("***************************");
		//re-initialization of num1, num2 & result
		num1=21;
		num2=5;
		result=num1%num2;//21%5
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Mod of two numbers: "+result);		
		System.out.println("Program Ends");
	}

}
/*

+: addition
-: Subtraction
*: Multiplication
/: Division
%: Mod


completenumber/completernumber=completernumber
21/5=4

incompletenumber/completernumber=incompleternumber
21.0/5=4.2

completenumber/incompleternumber=incompleternumber
21/5.0=4.2


25%5=0

37%5=2

43%8=3

*/
