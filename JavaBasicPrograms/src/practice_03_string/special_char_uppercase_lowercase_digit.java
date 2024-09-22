package practice_03_string;

public class special_char_uppercase_lowercase_digit {

	public static void main(String[] args) {
		// special_char_uppercase_lowercase_digit & other special char including spaces in given string
		 String str1="Great Power";  
	        StringBuffer newStr=new StringBuffer(str1);  
	          
	        for(int i = 0; i < str1.length(); i++) {  
	              
	            //Checks for lower case character  
	            if(Character.isLowerCase(str1.charAt(i))) {  
	                //Convert it into upper case using toUpperCase() function  
	                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
	            }  
	            //Checks for upper case character  
	            else if(Character.isUpperCase(str1.charAt(i))) {  
	                //Convert it into upper case using toLowerCase() function  
	                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));  
	            }  
	        }  
	        System.out.println("String after case conversion : " + newStr);  
	    }  
	  
	

}
