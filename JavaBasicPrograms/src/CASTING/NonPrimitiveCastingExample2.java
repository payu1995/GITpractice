package CASTING;



class Parent1{
	void myHome() {
		System.out.println("I am parent home");
	}
}
class Child1 extends Parent1{
	void myCar() {
		System.out.println("I am child car");
	}
}
public class NonPrimitiveCastingExample2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("****************Upcasting*******************");
		Parent1 p1=new Child1();//auto/implicit upcasting --->Parent p1=(Parent)new Child();
		p1.myHome();
		System.out.println("***********Downcasting*****************");
		//Child c1=new Parent();//downcasting is not possible directly
		
		/*
		 * if you want to perform down casting then only up casted object can be down casted
		 */
		Child1 c1=(Child1)p1;
		c1.myCar();
		c1.myHome();
		System.out.println("Program Ends");
	}
}
