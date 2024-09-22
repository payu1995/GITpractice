package ENCAPSULATION;


class Demo{
	private int age=25;
	private double salary=45000;
	/**
	 * getter: its a method that will help you to access private data member from outside the class
	 * 
	 * access modified: public
	 * return type: based on required private variable datatype
	 * argument: NA
	 */
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	/**
	 * setter: its a method that will help you to modify private data member from outside the class
	 * access modified: public
	 * return type: void
	 * argument: based on required private variable datatype
	 */
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Example1 {

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
