package METHOD;

public class Example4 {


	public static void main(String[] args) {
		primeNumber();
		checkPrimeNumber(17);
		checkPrimeNumber(11);
		System.out.println("**************************************");
		//isGivenNumberPrime(17);//it will execute method body but we won't be able to use its return value 
		//System.out.println("is given number prime? "+isGivenNumberPrime(17));//it will execute method body and also you will be able to print its return value in the console
		boolean res=isGivenNumberPrime(17);//it will execute method body and also it will store its return value for future use
		System.out.println(res);
	}	
	
	static void primeNumber() {
		int num=10,ct=0;		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {//5%1=0 | 5%2!=0 | 5%3!=0 | 5%4!=0 | 5%5=0
				ct++;//ct=1 | ct=2
			}
		}		
		if(ct==2) {
			System.out.println("Given number is prime: "+num);
		}else {
			System.out.println("Given number is not a prime: "+num);
		}
	}
	
	static void checkPrimeNumber(int num) {
		int ct=0;		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {//5%1=0 | 5%2!=0 | 5%3!=0 | 5%4!=0 | 5%5=0
				ct++;//ct=1 | ct=2
			}
		}		
		if(ct==2) {
			System.out.println("Given number is prime: "+num);
		}else {
			System.out.println("Given number is not a prime: "+num);
		}
	}
	
	static boolean isGivenNumberPrime(int num) {
		int ct=0;
		boolean res;
		System.out.println("Given number is: "+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				ct++;
			}
		}		
		if(ct==2) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
	
}
/*
method with parameter: when you want to perform some logical operation and for each execution you want diff values
then its recommended to use parameter in the method

method with return type: when you want to perform some logical operation and you want method to return the result
dn its recommended to use return type
*/