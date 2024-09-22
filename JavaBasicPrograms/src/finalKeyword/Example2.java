package finalKeyword;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int age=25;//declaring variable as constant 
		System.out.println("Local Variable age: "+age);
		int age1 = 30;//Compile time error as we are trying to modify constant variable
		System.out.println("updated,Local Variable age: "+age);
		age=15;//Compile time error as we are trying to modify constant variable
		System.out.println("updated,Local Variable age: "+age);
		age=45;//Compile time error as we are trying to modify constant variable
		System.out.println("updated,Local Variable age: "+age);
		System.out.println("Program ends");
	}

}
