package OPERATOR;

public class Example2 {

	public static void main(String[] args) {
		int num1=25,num2=45;
		boolean cond1=(num1!=num2);//cond1=!(num1==num2);
		boolean cond2=(num1<num2);
		
		boolean res1=(cond1 && cond2);//t
		boolean res2=(cond1 || (num1==num2));//t
		boolean res3=((num1<=num2) && (num1==num2));//f
		boolean res4=((num1<=num2) || (num1==num2));//t
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		System.out.println("Result3: "+res3);
		System.out.println("Result4: "+res4);
	}
}
/*

Cond1 && Cond2 : returns true when Cond1 and Cond2 values are true otherwise false

Cond1 || Cond2 : returns true when any Cond1 or Cond2 values are true, if both are false returns false

*/
