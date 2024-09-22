package aimportantquetion;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7
		int sum = 0, count = 0;
		 for (int i = 101; i < 200; i++)
		 {
		     if (i % 7 == 0)
		     {
		         sum = sum + i;
		         count++;
		     }
		 }
		 System.out.println("The Sum of the number between 100 to 200 which are divisible by 7 is: "+sum);
		 System.out.println("Total numbers between 100 to 200 which are divisible by 7 is: "+count);
		 }

	}



