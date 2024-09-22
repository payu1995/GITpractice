package loops;

public class Example3 {

	public static void main(String[] args) {

		System.out.println("*********Even number b/n 1 to 50**************");
		for(int i=11;i<=45;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("*********Vowels b/n A to Z************");
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
