package practice_01_if_else_program;

public class Example3 {

	public static void main(String[] args) {
		int marks=34;
		if(marks>=35) {
			if(marks>=70) {
				System.out.println("You are passed with distinction");
			}else {
				System.out.println("You are passed");
			}
		}else {
			System.out.println("you are failed");
		}

	}

}
