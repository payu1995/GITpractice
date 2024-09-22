package wrapperclasses;
final class Demo{
	final String name;
	final int age;
	Demo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}	
}
public class Example5 {

	public static void main(String[] args) {
		Demo d1=new Demo("Pune",12);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		
		//d1.name="Mumbai";//as name is declared as final,hence its value can't changed
	
		Demo d2=new Demo("Mumbai",25);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
	}
}



