package CASTING;



public class PrimitiveCastingExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25;
		double y=45502.36;
		
		long a=x;//widening-implicit
		float b=(float)y;//narrowing-explicit
		double c=(double)x;//widening -explicit
		System.out.println("Program Ends");
	}

}
