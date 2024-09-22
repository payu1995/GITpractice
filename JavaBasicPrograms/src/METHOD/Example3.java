package METHOD;

public class Example3 {


	public static void main(String[] args) {
		System.out.println("**************1st time addNumber()*************");
		addNumber();
		System.out.println("**************2nd time addNumber()*************");
		addNumber();
		System.out.println("*************1st time additionOfTwoNumber(int , int)************");
		additionOfTwoNumber(10, 50);
		System.out.println("*************2nd time additionOfTwoNumber(int , int)************");
		additionOfTwoNumber(50, 80);
	}	
	static void addNumber() {
		int num1=25,num2=45,res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}	
	static void additionOfTwoNumber(int x,int y) {
		int result=x+y;
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Result: "+result);
	}
}
/*
method with parameter: when you want to perform some logical operation and for each execution you want diff values
then its recommended to use parameter in the method


*/