package predefined_classes01;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
//		int num1=10,num2=20,res=num1+num1;
		
		int num1,num2,res;
		
		//create an instance of Scanner class to read data at runtime
		Scanner snc=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=snc.nextInt();
		System.out.println("Enter number2: ");
		num2=snc.nextInt();
		res=num1+num2;
		System.out.println("Number1 "+num1);
		System.out.println("Number2 "+num2);
		System.out.println("Result "+res);
		
		boolean status;
		double salary;
		char grade;
		System.out.println("Enter status");
		status=snc.nextBoolean();
		System.out.println("Enter salary");
		salary=snc.nextDouble();
		System.out.println("Enter grade");
		grade=snc.next().charAt(0);
	}

}
