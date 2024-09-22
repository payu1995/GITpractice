package practice_03_string;

public class reverse_position_spaces {
	 static void reverseString(String input) {  
		 
		// wap to reverse a string with preserving the position of spces for example ,if "i am not string " is the given string then //
			//reverse of this string with preserving the position of sapces is "g ni rtstonmai".
		   
	        char[] inputArray = input.toCharArray();  
	        char[] result = new char[inputArray.length];  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
	   
	        int j = result.length - 1;  
	   
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] != ' ') {  
	                if (result[j] == ' ') {  
	                    j--;  
	                }  
	                result[j] = inputArray[i];  
	                j--;  
	            }  
	        }  
	        System.out.println(input + " --> " + String.valueOf(result));  
	    }  
	   
	    public static void main(String[] args) {  
	        reverseString("i am not string");  
	    }  
	}  


	
		
		
	


