package aimportantquetion;

public class example3 {

	public static void main(String[] args) {
		// Write a program to convert given no. of days into months and days. (Assume that each month is of 30 days)
		int num = 69;

		int days = num % 30;
		int month = num / 30;
		System.out.println(num + " days = " + month + " Month and " + days + " days");
	}
}