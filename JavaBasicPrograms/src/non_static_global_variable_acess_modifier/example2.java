package non_static_global_variable_acess_modifier;

public class example2 {
	public static void main(String[] args) {
		// reverse number program in java

		example2 obj = new example2();
		obj.addNumber(10);

	}

	public void addNumber(int num) {
		int n1 = 20;

		for (int i = num; i >= 1; i--) {
			System.out.println("reverse number is : " + i);

		}
		return; 
		// System.out.println("reverse number is : "+ i);
	}
}


