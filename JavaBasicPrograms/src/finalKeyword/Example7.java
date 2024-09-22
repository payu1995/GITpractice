package finalKeyword;

public class Example7 {

	final static int age;	
	static {
		System.out.println("****************Start of SIB*******************");
		age=25;
		System.out.println("****************End of SIB*******************");
	}
	final double salary;
	final float roi;
	
	{
		System.out.println("****************Start of NSIB*******************");
		salary=25000.56;
		System.out.println("****************End of NSIB*******************");
	}	
	Example7(){
		System.out.println("Example7 cons started");
		roi=7.5f;
		System.out.println("Example7 cons ends");
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV age : "+age);
		Example7 e1=new Example7();
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("NSGV ROI: "+e1.roi);
		System.out.println("Program ends");
	}
}
/*
We can declare global variable with final keyword but its should be initialize at the same time

but:
	static global variable: can be declared and initialized later from the static block only

	non-static global variable: can be declared and initialized later from the
			- non-static block
			- constructor
*/
