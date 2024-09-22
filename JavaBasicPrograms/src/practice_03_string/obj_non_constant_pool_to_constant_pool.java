package practice_03_string;

public class obj_non_constant_pool_to_constant_pool {

	public static void main(String[] args) {
		// wap to store string obj_non_constant_pool area to_constant_pool area.

		// String object created in the heap (non-constant pool area)
        String str1 = new String("Hello");

        // Check memory reference before intern()
        String str2 = "Hello";  // String literal stored in the constant pool
        System.out.println("Before intern():");
        System.out.println("str1 == str2: " + (str1 == str2)); // false, different memory areas

        // Move the string to the constant pool using intern()
        String str3 = str1.intern();

        // Check memory reference after intern()
        System.out.println("After intern():");
        System.out.println("str3 == str2: " + (str3 == str2)); // true, both reference the constant pool
    }


	




}
