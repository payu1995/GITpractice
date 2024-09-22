package practice_03_string;

public class reverse_each_word06 {

	
public static String reverseWord(String str){  
		// wap reverse_each_word of guven string for exmple if "java concept of the day" is input string then o/p should be //
		//reverse

	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	 
			

public static void main(String[] args) { 
	    System.out.println(reverse_each_word06.reverseWord("java concept of the day"));  
	    System.out.println(reverse_each_word06.reverseWord("java concept of the week"));    
	    }  
	}  	

	
