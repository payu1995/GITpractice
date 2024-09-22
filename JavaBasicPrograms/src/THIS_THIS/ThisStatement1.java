package THIS_THIS;



class ThisStatement1 {
	ThisStatement1() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ThisStatement1(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ThisStatement1(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ThisStatement1(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ThisStatement1(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String args[]) {
		ThisStatement1 pc5 = new ThisStatement1();
		ThisStatement1 pc1 = new ThisStatement1(12);
		ThisStatement1 pc2 = new ThisStatement1(13.34);
		ThisStatement1 pc3 = new ThisStatement1(10,13.34,45);
		ThisStatement1 pc4 = new ThisStatement1(13.34,23,87);
	}
}

/**
this(): its also known as current class instance
		it should be used inside the constructor only
		In constructor this() should be the 1st statement
	    its used to call another constructor of the current class based on the parameter
 */
