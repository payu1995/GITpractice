package POLYMORPHISAM;
class Demo2{
	int age=25;
}
public class RunTimPoly2 extends Demo2 {
	int age=50;
	public static void main(String[] args) {
		RunTimPoly2 r1=new RunTimPoly2();//no poly
		System.out.println("Age from RunTimPoly2: "+r1.age);
		
		Demo2 d1=new Demo2();//no poly
		System.out.println("Age from Demo2: "+d1.age);
		
		Demo2 d2=new RunTimPoly2();//no poly
		System.out.println("Age from Demo2: "+d2.age);
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



