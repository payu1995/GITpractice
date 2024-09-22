package METHOD_OVERLOADING;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		example2 ref=new example2();
		ref.addNumber();
		ref.addNumber(25.35f,36.35);
		ref.addNumber(85.5,96.36f);
		ref.addNumber(85,74);
	}	
	void addNumber() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}	
	void addNumber(int num1, int num2) {
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}	
	void addNumber(double num1, float num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addNumber(float num1, double num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
}
/*
When we declare same method(static or non-static) more then once in a class with diff set of parameter then those
method will be known as overloaded methods

diff set of parameter
	1. diff in type of parameters  //or
			add(int a, int b)
			add(double a, int b)
	
	2. diff in number of parameters //or
			add(int a, int b)
			add(int a, int b, int c)
	
	3. diff in position of parameters  //or
			add(int a, double b)
			add(double a, int b)
*/