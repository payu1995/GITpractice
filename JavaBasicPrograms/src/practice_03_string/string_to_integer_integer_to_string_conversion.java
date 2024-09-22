package practice_03_string;

public class string_to_integer_integer_to_string_conversion {

	public static void main(String[] args) {
		
		// string to integer conversion
		  //1st way  
        String str1 = "123";  
        int num = Integer.parseInt(str1); // Using Integer.parsrInt()  
        System.out.println("string to integer :"+num);  
   
       
        //integer to string conversion
        System.out.println();
        int intNum=456;
        String strNum = Integer.toString(intNum); // using String.valueOf()  
        System.out.println("integer to string:"+strNum);  
  
    

	}

}
