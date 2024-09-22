package THIS_THIS;

class ThisStatement2 {
	ThisStatement2() {
		this(25);
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ThisStatement2(int a) {
		this(25.36);
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ThisStatement2(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	public static void main(String args[]) {
		ThisStatement2 pc1 = new ThisStatement2();
//		ThisStatement2 pc2 = new ThisStatement2(12);
//		ThisStatement2 pc3 = new ThisStatement2(13.34);
	}
}
/**
this(): its also known as current class instance
		it should be used inside the constructor only
		In constructor this() should be the 1st statement
	    its used to call another constructor of the current class based on the parameter
 */


