package THIS_THIS;



class ThisStatement3 {
	ThisStatement3() {
		this(34.23);
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ThisStatement3(int a) {
		this();
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ThisStatement3(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	public static void main(String args[]) {
		//ThisStatement3 pc1 = new ThisStatement3();
		ThisStatement3 pc2 = new ThisStatement3(12);
		//ThisStatement2 pc3 = new ThisStatement2(13.34);
	}
}
/**
double
zero
int
 
this(): its also known as current class instance
		it should be used inside the constructor only
		In constructor this() should be the 1st statement
	    its used to call another constructor of the current class based on the parameter
 */
