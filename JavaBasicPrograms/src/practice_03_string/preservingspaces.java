package practice_03_string;

public class preservingspaces {

	 public static String reverseStringPreservingSpaces(String str) {
		
		//Reverse the string with preserving the position of spaces
		//Or
		//Write a java program to reverse a string with preserving the position of spaces. 
		//For example, if “I Am Not String” is the given string then the reverse of this string 
		//with preserving the position of spaces is “g ni rtS toNmAI”.
		
		 // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Create a temporary array to store non-space characters
        char[] temp = new char[str.length()];
        
        // Fill the temp array with non-space characters from the original string
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] != ' ') {
                temp[index] = charArray[i];
                index++;
            }
        }

        // Reverse the non-space characters in temp array
        index--;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] != ' ') {
                charArray[i] = temp[index];
                index--;
            }
        }
        
        // Convert char array back to string and return
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "I love Java";
        String result = reverseStringPreservingSpaces(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
		
		
		
		
		
		
		
		
	
