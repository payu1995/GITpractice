package day1.simpleprograms;

public class circle {
	// **variable**//
	// static global variable and non static global variable

	// global variable
	// int pie= 3.14, r=54, a=15 ; // nsgv
	static int B = 8, H = 10, pie = (int) 3.142, r = 5, a = 15;

	public static void main(String[] args) {

		System.out.println("program start");
//local variable
		double result;
		System.out.println("area of triangle");
		circle c = new circle();
		result = 0.5 * B * H;
		System.out.println("sgv B is : " + B);
		System.out.println("sgv H is :" + H);
		System.out.println("lv result : " + result);

		System.out.println("area of circle");
		circle c1 = new circle();
		result = pie * r * r;
		System.out.println("ngv r reffers to r is : " + r);
		System.out.println("lv result : " + result);

		System.out.println("area of square");
		circle c2 = new circle();
		result = a * a;
		System.out.println("sgv a is :" + a);
		System.out.println("sgv a is :" + a);
		System.out.println("lv result :" + result);
		System.out.println("program end");

	}

}
