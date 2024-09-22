package INHERITANCE;

//super class/ parent class / base class
class Grandfather10 {
	Grandfather10() {
		System.out.println("I am Class Grandfather constrctuor...");
	}
	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}
//subclass / child class / derived class
class Father10 extends Grandfather10 {
	Father10(double d) {
		//super();// if we dont wirte this dn java compiler will write by default super()
		System.out.println("I am Class Father constrctuor...");
	}
	void myCar() {
		System.out.println("I am car of Father");
	}
}
class Child10 extends Father10 {
	Child10(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor...");
	}
	void myBike() {
		System.out.println("I am bike of child");
	}
}
public class Inheritance7 {
	public static void main(String[] args) {
		System.out.println("*******************************************");
		Child10 c1 = new Child10(21);// home, car & bike
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("****************Father property***************************");
		Father10 f1=c1;//Father10 f1=c1= new Child10(21); | Father10 f1= new Child10(21);
		f1.myHome();
		f1.myCar();
		System.out.println("****************GrandFather property***************************");
		Grandfather10 g1=c1;//Grandfather10 g1=c1= new Child10(21); | Grandfather10 g1= new Child10(21);
		g1.myHome();
	}
}
/*
* add debug point into the required steps
* use following keys
* 		f6	----> next line, execute current line and move next file
* 		f5  ----> go inside the function
* 		f8  ----> continue, to continue the normal execution flow
* 		ctrl+shift+f ----> to check the variable value or method return value
*/
/*
* statements are two type
* 		1. Homogeneous :    LHS = RHS
* 		2. Heterogeneous :  LHS != RHS
* 
* 			int age=20; // Homogeneous
* 			double salary=25000; //Heterogeneous
* 			
* 			A a1 = new A();
* 			A a2 = new B();
* 			A a3 = a1;
* 			B b1 = new B();
* 			A a4 = b1;
*/ 
