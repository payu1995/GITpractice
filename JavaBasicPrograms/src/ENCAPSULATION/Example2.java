package ENCAPSULATION;



class Demo1{
	
public class Example2 {

	public static void main(String[] args) {
		Demo ref=new Demo();
		/** will getting compile time error while access private member from outside the class directly*/
//		System.out.println("Demo class, private age: "+ref.age);
//		System.out.println("Demo class, private salary: "+ref.salary);
		
		System.out.println("Demo class, private age using getter: "+ref.getAge());
		System.out.println("Demo class, private salary using getter: "+ref.getSalary());
		
		ref.setAge(50);
		ref.setSalary(75000);
		
		System.out.println("Demo class, private age using getter: "+ref.getAge());
		System.out.println("Demo class, private salary using getter: "+ref.getSalary());	}
	

}
