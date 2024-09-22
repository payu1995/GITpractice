package practice_03_string;

public class count_occurance_each_charecter05 {

	
		
		//count_occurance_each_charecter in a string java //
		
		//wap to count the no of occurance of each charecter in given string for exple if "java j2EE java jsp j2EE is //
		//the given strinh then occurance_each_charecter in this string E=4, 2=2, V=2,P=1,S=1,A=4,J=5.
		
		
		static final int MAX_CHAR = 256;  
		static void getOccuringChar(String str)  
		{  
		//creating an array of size 256 (ASCII_SIZE)  
		int count[] = new int[MAX_CHAR];  
		//finds the length of the string  
		int len = str.length();  
		//initialize count array index  
		for (int i = 0; i < len; i++)  
		count[str.charAt(i)]++;  
		//create an array of given String size  
		char ch[] = new char[str.length()];  
		for (int i = 0; i < len; i++)   
		{  
		ch[i] = str.charAt(i);  
		int find = 0;  
		for (int j = 0; j <= i; j++)   
		{  
		//if any matches found  
		if (str.charAt(i) == ch[j])  
		find++;  
		}             
		if (find == 1)  
		//prints occurrence of the character   
		System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		}  
		}  
		//driver Code  
		public static void main(String args[])  
		{  
		String str = "java j2EE java jsp j2EE"; //lung disease  
		//function calling  
		getOccuringChar(str);  
		}  
		}  
