package practice_problem_array;

public class copy_element {

	public static void main(String[] args) {

		int arr1[] = new int[] { 3, 5, 7, 9, 11 };
		int arr2[] = new int[arr1.length];

		System.out.println("element of first array : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");

		}

//copying all element of firstarray to secondarray;

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
//display element of secondarray
		System.out.println("element of original array : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");

		}

		System.out.println();
		System.out.println("element of new array : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}

}
