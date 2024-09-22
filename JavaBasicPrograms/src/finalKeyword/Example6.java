package finalKeyword;

public class Example6 {

	final static int age=25;
	final double salary=4500.56;
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV age : "+age);
		Example6 e1=new Example6();
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("Program ends");
	}
}
/*
We can declare global variable with final keyword but its should be initialize at the same time


*/
