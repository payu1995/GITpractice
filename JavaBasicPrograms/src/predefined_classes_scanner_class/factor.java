package predefined_classes_scanner_class;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("print factor : " + " ");

		int num = sc.nextInt();

		int n = 30;

		for (int i = 1; i <= n; i++)

			if (n % i == 0) {

				System.out.println(" given factor are :" + i);
			}

	}

}
