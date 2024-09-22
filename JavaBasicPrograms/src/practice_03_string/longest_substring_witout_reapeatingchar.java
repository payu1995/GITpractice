package practice_03_string;

public class longest_substring_witout_reapeatingchar {

	  public static int lengthOfLongestSubstring(String s) {  
		// Find longest substring without repeating characters.  
	        int n = s.length(); // Get the length of the input string  
	        int maxLength = 0; //Initialize the maximum length of the substring  
	  
	        // Iterate through all possible substrings  
	        for (int i = 0; i < n; i++) {  
	            for (int j = i + 1; j <= n; j++) {  
	                if (allUnique(s, i, j)) {  
	                    maxLength = Math.max(maxLength, j - i); // Update the maximum length if the substring is unique  
	                }  
	            }  
	        }  
	  
	        return maxLength; // Return the maximum length of the substring  
	    }  
	  
	    // Helper method to check if all characters in a substring are unique  
	    private static boolean allUnique(String s, int start, int end) {  
	        for (int i = start; i < end - 1; i++) {  
	            for (int j = i + 1; j < end; j++) {  
	                if (s.charAt(i) == s.charAt(j)) {  
	                    return false; // Return false if any characters are repeated  
	                }  
	            }  
	        }  
	        return true; // Return true if all characters are unique  
	    }  
	  
	    // Main Method for testing the algorithm  
	    public static void main(String[] args) {  
	        String input = "javatpoint"; // Set the input string  
	        int result = lengthOfLongestSubstring(input); // Call the method to find the result  
	  
	        // Display the result  
	        System.out.println("Length of the longest substring without repeating characters: " + result);  
	    }  
	}  
	


