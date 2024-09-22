package practice_03_string;

public class percentage_lower_upper_digit {

	
		
		//Percentage of uppercase, lowercase, digits and special characters in a string
		//Or
		//Write a java program to find the percentage of uppercase letters, lowercase letters,
        //digits and other special characters(including space) in the given string.
		
		 // Method to calculate the percentage of different character types in a string
	    public static void calculateCharacterPercentage(String str) {
	        int totalLength = str.length();
	        int upperCaseCount = 0;
	        int lowerCaseCount = 0;
	        int digitCount = 0;
	        int specialCharCount = 0;
	        int spaceCount = 0;

	        // Traverse through each character in the string
	        for (int i = 0; i < totalLength; i++) {
	            char ch = str.charAt(i);
	            
	            if (Character.isUpperCase(ch)) {
	                upperCaseCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCaseCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            } else {
	                specialCharCount++;
	            }
	        }

	        // Calculate the percentage
	        double upperCasePercentage = (upperCaseCount * 100.0) / totalLength;
	        double lowerCasePercentage = (lowerCaseCount * 100.0) / totalLength;
	        double digitPercentage = (digitCount * 100.0) / totalLength;
	        double specialCharPercentage = (specialCharCount * 100.0) / totalLength;
	        double spacePercentage = (spaceCount * 100.0) / totalLength;

	        // Print the percentages
	        System.out.printf("Uppercase letters: %.2f%%\n", upperCasePercentage);
	        System.out.printf("Lowercase letters: %.2f%%\n", lowerCasePercentage);
	        System.out.printf("Digits: %.2f%%\n", digitPercentage);
	        System.out.printf("Special characters (excluding space): %.2f%%\n", specialCharPercentage);
	        System.out.printf("Spaces: %.2f%%\n", spacePercentage);
	    }

	    public static void main(String[] args) {
	        String input = "Hello World! 1234 @#$";
	        calculateCharacterPercentage(input);
	    }
	}
		
		
		
		
		
		
		
		
		
	
