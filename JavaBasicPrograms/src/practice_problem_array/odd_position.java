package practice_problem_array;

public class odd_position {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("element of given array present in odd position:" + " ");
		
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

}
