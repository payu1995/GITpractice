package STRING;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "CoreJavaBasics";// constant-pool
		System.out.println("s1: " + s1);
		System.out.println("Char count in s1: " + s1.length());
		// System.out.println("char at index 3: "+s1.charAt(3));
		for (int i = 0; i < s1.length(); i++) {
			System.out.println("char at index "+i+": "+s1.charAt(i));
		}
		System.out.println("************Reverse string*******************");
		String temp="";
		for (int i = s1.length()-1; i >=0; i--) {
			temp=temp+s1.charAt(i);
		}
		System.out.println("Reverse string of 'CoreJavaBasics': "+temp);
		System.out.println("********************************************");
		String s2="corejavabasics";
		System.out.println("s2: "+s2);
		System.out.println("s1 and s2 comparision using values: "+s1.equals(s2));
		System.out.println("s1 and s2 comparision using values: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 ends with 'sics': "+s1.endsWith("sics"));
		System.out.println("s1 starts with 'Core': "+s1.startsWith("Core"));
		System.out.println("s1 contains 'eJa': "+s1.contains("eJa"));
		
		System.out.println("'a' index is: "+s1.indexOf('a'));
		System.out.println("'a' index is: "+s1.lastIndexOf('a'));
		
		String s3=s1.substring(4);
		System.out.println("s3: "+s3);
		String s4=s1.substring(6,10);
		System.out.println("s4: "+s4);
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
 */