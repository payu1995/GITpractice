
package predefined_classes_scanner_class;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("reverse number is : " + " ");

		int num = sc.nextInt();

		for (int i1 = 10; i1 >= 1; i1--) {

			System.out.println("reverse number is : " + i1);
		}
	}
}
