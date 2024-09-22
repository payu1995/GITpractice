package finalKeyword;

public class Example8 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		for(int i=1;i<=5;i++)//number row
		{
			for(int j=1;j<=i;j++)
			{//numbers to be printed in each row
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("#########################");
		for(int i=1;i<=5;i++) {//number row
			for(int j=1;j<=i;j++) {//numbers to be printed in each row
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Program ends");
	}
}
