package loops;

public class Example2 {

public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("***********************");
		for(int i=1;i<6;i++) {
			System.out.println("Hello");
		}
		System.out.println("************************");
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
		System.out.println("************************");
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("************************");
		int x=5;
		for(;x>=1;) {
			System.out.println(x);
			x--;
		}
		System.out.println("**********A to Z**************");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+",");
		}
		System.out.println("\n**********Z to A**************");
		for(char ch='Z';ch>='A';ch--) {
			System.out.print(ch+",");
		}
	}
}
/*
when you want to execute a set of statements again and again with fixed number of iteration
	- then we should use loops
	
int i=1;
	step1: 1<=5
	step2: console->	Hello
	step3: i=2
	
	step1: 2<=5
	step2: console->	Hello
	step3: i=3
	
	step1: 3<=5
	step2: console->	Hello
	step3: i=4
	
	step1: 4<=5
	step2: console->	Hello
	step3: i=5
	
	step1: 5<=5
	step2: console->	Hello
	step3: i=6
	
	step1: 6<=5 fail
	

*/
