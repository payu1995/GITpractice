package THIS_THIS;

public class NonStaticDiff {
	int age;//non-static global variable	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonStaticDiff ref=new NonStaticDiff();
		ref.print();
		System.out.println("Program Ends");
	}
	void print() {
		System.out.println("Print method started");
		System.out.println("age: "+age);
		int age=25;
		System.out.println("age: "+age);
		
//		NonStaticDiff n1=new NonStaticDiff();
//		System.out.println("NSGV age: "+n1.age);
				//or
		System.out.println("NSGV age: "+this.age);		
		System.out.println("Print method ends");
	}
}
/*
this keyword: it is known as current class instance/object
			  it is used inside constructor or non-static method only
			  used to access non-static member of the class from constructor/non-static method
			  mainly used when non-static global variable name and nonstatic method local variable name is same, so
			  in order diff them we can use this keyword
*/


