package POLYMORPHISAM;



class Demo{
	void calling() {
		System.out.println("Calling from Demo class");
	}
}
public class RunTimPoly extends Demo {
	void calling() {
		System.out.println("Calling from Demo RuntimePoly");
	}
	public static void main(String[] args) {
		RunTimPoly r1=new RunTimPoly();//no poly
		r1.calling();
		
		Demo d1=new Demo();//no poly
		d1.calling();
		
		Demo d2=new RunTimPoly();//runtime poly
		d2.calling();
	}
}
/*
When a method gets to know its implementation at runtime dn that will be known as
	-Runtime poly/late binding/dynamic binding
	
for this we should have
	-inheritance
	-overriding
	-upcasting
*/
