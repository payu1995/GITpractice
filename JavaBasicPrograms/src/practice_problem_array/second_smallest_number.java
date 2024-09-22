
package practice_problem_array;

public class second_smallest_number {

	// TODO Auto-generated method stub
	public static int smallestelement(int[] a, int total) {

		int temp;

		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		return a[1]; // 2nd element because index start from 0

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 8, 9 };
		int b[] = { 44, 55, 99, 66, 11, 33 };

		System.out.println("second smallest :  " + smallestelement(a, 5));
		System.out.println("second smallest :  " + smallestelement(b, 5));

	}
}
