
package practice_03_string;

public class first_non_reapeated_char {
	
	 public static int firstUniqChar(String s) {
		 
	//given string your code must find out the first_reapeated_non_reapeated_charin that string for example if//
			//"javaoncept of the day" is the given string then "j"is a first non_reapeated_char and "a" is first reapeated_char

	    
	        int n = s.length();

	        // Step 1: Iterate over each character in the string
	        for (int i = 0; i < n; ++i) {
	            boolean found = true;

	            // Step 2: Check if the character repeats in the
	            // rest of the string
	            for (int j = 0; j < n; ++j) {
	                if (i != j && s.charAt(i) == s.charAt(j)) {
	                    found = false;
	                    break;
	                }
	            }

	            // Step 3: If character does not repeat, return
	            // its index
	            if (found) {
	                return i;
	            }
	        }

	        // Step 4: If no such character is found, return -1
	        return -1;
	    }

	    // Driver code
	    public static void main(String[] args)
	    {
	        String s = "javaoncept of the day";
	        System.out.println(firstUniqChar(s));
	        
	    }
	
	
		
	}


