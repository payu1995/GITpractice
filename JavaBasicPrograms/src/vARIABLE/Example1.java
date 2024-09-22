package vARIABLE;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//Syntax to declare- datatype variablename;
		byte variable1;
		short variable2;
		int variable3;
		long variable4;
		float variable5;
		double variable6;
		char variable7;
		boolean variable8;		
		//Systax to initialize- variablename = value;
		variable1=10;//25|30|-50|-27
		variable2=20;//25|30|-50|-27
		variable3=30;//30|-52|-40|90
		variable4=40l;//15| -25|60| 50l
		variable5=10.56f;//25| -60|-90|40| 58.56f
		variable6=36.56d;//36.56| 25| -93| 25.36f
		variable7='A';//'x'| 'S'| 'd' | '+'
		variable8=true;//false
		//System.out.println("variable1");//variable1
		//System.out.println(variable1);//10
		
		//variable1=10
		System.out.println("variable1="+variable1);
		//TODO: print remaining variables
		System.out.println("Program Ends");
	}
}
/*
 + : addition operator : when LHS & RHS both are integer/number
 	number1 + numer2 =number3
 	20+10=30
 	50+90=140
 
 + : Concatenation operator : when LHS or RHS any one is String type("")
	"String"+10=String10(String form)
	
	"Hello"+20=Hello20+10=Hello2010
	
	"Hi"+20+30=Hi2030
	
	"Hi"+(20+30)=Hi50
	
	10+20+"Bye"=30Bye
	
	10+50+"Hi"+70+80+"Bye"+90 = 60Hi7080Bye90 
 */
