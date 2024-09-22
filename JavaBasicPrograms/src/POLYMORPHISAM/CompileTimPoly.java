package POLYMORPHISAM;

public class CompileTimPoly {

	static void add() {
		System.out.println("Add without param");
	}
	static void add(int a,int b) {
		System.out.println("Add with int-int");
	}
	public static void main(String[] args) {
		CompileTimPoly.add();
		CompileTimPoly.add(10, 20);
	}
}
/*
When a method gets to know its implementation at compile time dn that will be known as
	-Compile time poly/static binding/early binding
	
for we need static method overloading
*/