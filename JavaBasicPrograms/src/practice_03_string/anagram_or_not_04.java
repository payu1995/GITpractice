package practice_03_string;

import java.util.Arrays;

public class anagram_or_not_04 {

	public static void main(String[] args) {
		// // wap to check wheather two given string are anagrwam or not two string are said to be anagram if they conain same set of }
		//charecter but in different order for example "mother in law" and hitler women " are anagram.
		
		 String str1="mother in law";  
	        String str2="hitler women";  
	  
	        //Converting both the string to lower case.  
	        str1 = str1.toLowerCase();  
	        str2 = str2.toLowerCase();  
	  
	        //Checking for the length of strings  
	        if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        else {  
	            //Converting both the arrays to character array  
	            char[] string1 = str1.toCharArray();  
	            char[] string2 = str2.toCharArray();  
	  
	            //Sorting the arrays using in-built function sort ()  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            //Comparing both the arrays using in-built function equals ()  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        }  
	    }  
	  

	}


