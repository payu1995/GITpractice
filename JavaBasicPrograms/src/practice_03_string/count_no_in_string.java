package practice_03_string;

public class count_no_in_string {

	public static void main(String[] args) {
		// find the count of no in the given string "hey123487hey"?
		
		  String string = "hey123487hey";  
	        int count = 0;  
	          
	        //Counts each character except space  
	        for(int i = 0; i < string.length(); i++) {  
	            if(string.charAt(i) != ' ')  
	                count++;  
	        }  
	          
	        //Displays the total number of characters present in the given string  
	        System.out.println("Total number of characters in a string: " + count);  
	    }  
	
	}


