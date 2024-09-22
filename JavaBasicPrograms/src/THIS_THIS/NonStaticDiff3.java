package THIS_THIS;

public class NonStaticDiff3 {
	int age;//non-static global variable	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonStaticDiff3 ref=new NonStaticDiff3();
		ref.print();
		System.out.println("Program Ends");
	}
	void print() {
		System.out.println("Print method started");
		System.out.println("NSGV age: "+age);
		int age=25;
		System.out.println("local age: "+age);
		//globalVariable=localVariable;
		this.age=age;
		System.out.println("local age: "+age);
		System.out.println("NSGV age: "+this.age);	
		
		//calling();
			//or
		this.calling();
		System.out.println("Print method ends");
	}
	
	void calling() {
		System.out.println("I am calling you");
	}
}
/*
this keyword: it is known as current class instance/object
			  it is used inside constructor or non-static method only
			  used to access non-static member of the class from constructor/non-static method
			  mainly used when non-static global variable name and nonstatic method local variable name is same, so
			  in order diff them we can use this keyword
*/


