package practice_problem_array;

public class largest_element {

	public static void main(String[] args) {

		int[] arr = new int[] { 99, 75, 56, 85, 15 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("largest element present in given array:" + max);

	}
}
