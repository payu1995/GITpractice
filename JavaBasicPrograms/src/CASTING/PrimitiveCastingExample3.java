package CASTING;

public class PrimitiveCastingExample3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a=10,b=20;
		addition(a, b);
		
		System.out.println("Addition of two number: "+getSum(a, b));
		System.out.println("Division result is: "+getDivResult(a, b));
		System.out.println("Program Ends");
	}
	
	static void addition(double x,float y) //double x=a; | double y=b; //implicit widening
	{
		System.out.println("number1: "+x);
		System.out.println("number2: "+y);
		double sum=x+y;//implicit widening
		System.out.println("sum: "+sum);
	}
	
	static double getSum(int x,int y) {
		System.out.println("number1: "+x);
		System.out.println("number2: "+y);
		int sum=x+y;
		return sum;//implicit widening
	}
	
	static int getDivResult(int x,int y) {
		System.out.println("number1: "+x);
		System.out.println("number2: "+y);
		double result=y/x;//implicit widening
		return (int)result;//explicit narrowing
	}
}


