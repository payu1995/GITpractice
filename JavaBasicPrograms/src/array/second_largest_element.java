package array;

public class second_largest_element {

	public static int largestelement(int[] a, int total) {

		int temp;

		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++) {

				if (a[i] > a[j]) {

					temp = a[i];a[i] = a[j];a[j] = temp;

				}
			}
		}

		return a[total - 2];

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 8, 9, 6, 8, 7 };
		int b[] = { 44, 55, 99, 66, 77, 44, 22, 11 };

		System.out.println("second largest :  " + largestelement(a, 7));
		System.out.println("second largest :  " + largestelement(b, 7));

	}
}
