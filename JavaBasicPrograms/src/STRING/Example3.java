package STRING;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "  Core   Java   Basics   ";// constant-pool
		System.out.println("s1-->" + s1);
		System.out.println("Char count in s1: " + s1.length());		
		System.out.println("without spaces s1--->"+s1.trim());
		System.out.println("without spaces s1--->"+s1.trim().length());
		
		String s2="Hello Everyone, Welcome to Java session";
		String[] strArray=s2.split(" ");
		for(String st:strArray) {
			System.out.println(st);
		}
		System.out.println("**********************************");
		String[] strArray2=s2.split(" ",2);
		for(String st:strArray2) {
			System.out.println(st);
		}
		System.out.println("**********************************");
		String[] strArray3=s2.split(", ");
		for(String st:strArray3) {
			System.out.println(st);
		}
	}
}
/**
 * String--> predefined class in java belongs to java.lang package it represents
 * group/collection of characters In String class following methods are
 * overrided 1. toString() --> instead of printing string representation of
 * object it will print value stored inside the string object 2. equals() --->
 * here it will compare two objects based on value instead of address 3. == --->
 * compared two objects based on address instead of value We can create String
 * class object in two ways 1. by using new keyword ---> object will be stored
 * in non constant pool ---> by using this we can have duplicate object also 2.
 * by using literal ---> object will be stored in String constant pool(inside
 * heap) ---> by using this we can create only unique object inside the pool



**/