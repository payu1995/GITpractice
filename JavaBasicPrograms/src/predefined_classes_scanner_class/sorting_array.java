package predefined_classes_scanner_class;

import java.util.Arrays;
import java.util.Scanner;

public class sorting_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("element of sorted array is : " + " ");
		 int n = sc.nextInt();

		int[] arr = { 11, 2, 44, 5, 13 };

		// sorting copyfrom ascending order

		Arrays.sort(arr); // 1,2,3,4,5

		for (int i = 0; i < arr.length; i++) {

			System.out.println("sorted array :  " + arr[i]);
		}
	}
}
