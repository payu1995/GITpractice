package CASTING;


public class PrimitiveCastingExample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int x=25;
		
		//lower to higher ---> Widening
		float y=x; //implicit/auto Widening
		double z=(double)x;//explicit Widening
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		
		//higher to lower --->Narrowing
		double salary=45000.56;
		long slr1=(long)salary;//explicit narrowing | loss of data
		System.out.println("salary: "+salary);
		System.out.println("slr1: "+slr1);
		System.out.println("Program Ends");
	}

}

