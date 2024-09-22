package OPERATOR;

public class Example3 {

	public static void main(String[] args) {
		int x=25,y;
		y=x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		int z;
		z=++x;//increment - pre : first perform the operation dn use the updated value
		System.out.println("x: "+x);
		System.out.println("z: "+z);
		
		z=x++;//increment - post: first use the value dn perform the operation
		System.out.println("x: "+x);//27
		System.out.println("z: "+z);//26
		
		int a=10,b;
		b=--a;//decrement -pre : first perform the operation dn use the updated value
		System.out.println("a: "+a);//9
		System.out.println("b: "+b);//9
		
		b=a--;//decrement - post: first use the value dn perform the operation
		System.out.println("a: "+a);//8
		System.out.println("b: "+b);//9
	}

}
