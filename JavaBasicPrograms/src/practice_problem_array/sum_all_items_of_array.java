package practice_problem_array;

public class sum_all_items_of_array {

	public static void main(String[] args) {
		
		
		 int [] arr = new int [] {1, 2, 3, 4, 5};   
	        int sum = 0;  
	          
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {   
	           sum = sum + arr[i];  
	        }    
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	 

	}


