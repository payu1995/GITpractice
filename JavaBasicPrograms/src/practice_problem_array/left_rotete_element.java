package practice_problem_array;

public class left_rotete_element {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int n = 3;

		System.out.println("original array :" + " ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
//rotate the array left
		for (int i = 0; i < n; i++) {
			int j, first;

			// stored first element of array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}

			arr[j] = first;
		}
		System.out.println();
		System.out.println("array after left rotation:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
	}
}
