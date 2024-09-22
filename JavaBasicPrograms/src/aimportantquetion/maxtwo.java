package aimportantquetion;

import java.util.Scanner;

public class maxtwo {

	// Java Program to directly find the two largest elements in an array*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; // Declare array size
		System.out.println("Enter the size of the array");
		n = sc.nextInt(); // Initialize array size

		int arr[] = new int[n]; // Declare array
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) // Initialize array
		{
			arr[i] = sc.nextInt();
		}

		int lar1 = arr[0]; // Initialize the first largest element
		int lar2 = arr[1]; // Initialize the second largest element

		// Check by swapping elements

		if (lar1 < lar2) {

			int temp = lar1;
			lar1 = lar2;
			lar2 = temp;
		}

		for (int i = 2; i < n; i++) {

			if (arr[i] > lar1) {

				lar2 = lar1;
				lar1 = arr[i];
			} else if (arr[i] > lar2 && arr[i] != lar1) {

				lar2 = arr[i];
			}
		}
		System.out.println("First Largest" + lar1); // Display the first largest
		System.out.println("Second Largest " + lar2); // Display the second largest
	}
}
