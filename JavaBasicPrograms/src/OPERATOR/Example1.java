package OPERATOR;

public class Example1 {

	public static void main(String[] args) {		
		System.out.println("Program starts");
		int num1=25,num2=30;
		boolean res=(num1==num2);
		System.out.println("comparing num1 and num2 using '==' "+res);
		System.out.println("comparing num1 and num2 using '==' "+(num1==num2));
		System.out.println("comparing num1 and num2 using '!=' "+(num1!=num2));
		System.out.println("comparing num1 and num2 using '<' "+(num1<num2));
		System.out.println("comparing num1 and num2 using '<=' "+(num1<=num2));//25<=30
		System.out.println("comparing num1 and num2 using '>' "+(num1>num2));//25>30
		System.out.println("comparing num1 and num2 using '>=' "+(num1>=num2));//25>=30
		System.out.println("Program ends");
	}
}
/*
LHS==RHS : help you to compare LHS & RHS, returns true if both are equal else return false

LHS!=RHS : compare LHS & RHS, returns true if both are not equal, else returns false

>

<

>=

<=

*/
