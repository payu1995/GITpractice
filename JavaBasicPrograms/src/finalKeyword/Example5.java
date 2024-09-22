package finalKeyword;

public class Example5 {

	static int age;
	double salary;
	public static void main(String[] args) {
		System.out.println("Program starts");
		age=25;
		System.out.println("SGV age : "+age);
		Example5 e1=new Example5();
		e1.salary=45000.66;
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("Program ends");
	}
}
/*
We can declare global variable with final keyword but its should be initialize at the same time


*/
