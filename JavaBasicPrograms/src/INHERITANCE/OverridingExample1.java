package INHERITANCE;

class Testing{
	void learning() {
		System.out.println("You are learning Manual testing");
	}
}
public class OverridingExample1 extends Testing {
	public void learning() {
		System.out.println("You are learning Automation testing");
	}
	public static void main(String[] args) {
		
	}
}
/*
Overriding:
	* for this inheritance is mandatory
	* when we try to declare a method in child class which is already present in parent class dn 
	* that method will be known as overrided method
	* Only non-static method can be overrided
	* not possible
		* static method
		* constructor
		* final method
		* private method
		* variables
	* NOTE: while overriding we can increase the visibility of a method but we cann;t decrease it
	* if any method is written with access modifier as
		default ---> default/protected/public
		protected ---> protected/public
		public ---> public
		
		private--->default--->protected--->public


*/