package STRING;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";//constant-pool
		System.out.println("s1: "+s1);
		String s2="Hi";
		System.out.println("s2: "+s2);
		String s3="Hello";
		System.out.println("s3: "+s3);
		System.out.println("Comparing s1 and s2 using equals() with value: "+s1.equals(s2));
		System.out.println("Comparing s1 and s2 using '==' with address: "+(s1==s2));
		
		System.out.println("Comparing s1 and s3 using equals() with value: "+s1.equals(s3));
		System.out.println("Comparing s1 and s3 using '==' with address: "+(s1==s3));
		System.out.println("*********************************************************");
		String s4=new String("Mumbai");//1. in String constant pool | 2. non-constant pool
		String s5=new String("Pune");//1. in String constant pool | 2. non-constant pool
		String s6=new String("Hello");//1. non-constant pool
		
		System.out.println("Comparing s4 and s5 using equals() with value: "+s4.equals(s5));
		System.out.println("Comparing s4 and s5 using '==' with address: "+(s4==s5));
		
		System.out.println("Comparing s6 and s1 using equals() with value: "+s6.equals(s1));
		System.out.println("Comparing s6 and s1 using '==' with address: "+(s6==s1));
		
	}
}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are overrided
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> here it will compare two objects based on value instead of address
				3. == ---> compared two objects based on address instead of value
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/