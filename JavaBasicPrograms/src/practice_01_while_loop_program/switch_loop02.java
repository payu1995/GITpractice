package practice_01_while_loop_program;

public class switch_loop02 {

	public static void main(String[] args) {
	
		
		
		char ch = '*';
		int num1=50, num2=5,res;
		System.out.println("Number num1 is :" + num1);
		System.out.println("Number num2 is :" + num2);

		switch(ch){

		case '+':
		res=num1+num2;
		System.out.println( "Addition of two num  is : " +res);
		break;

		case '*':
		res=num1*num2;
		System.out.println( "Multiplication of two num   is : " + res);
		break;

		case '-':
		res=num1-num2;
		System.out.println( "Substraction of two num  is : " + res);
		break;

		case '/':
		res=num1/num2;
		System.out.println( "Division of two num  is : " + res);
		break;

		case '%':
		res=num1%num2;
		System.out.println( "Modulo of two num  is : " + res);
		break;

		}
		}
		
	}


