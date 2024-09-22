package constructor;
public class demo {
	public static void main(String[] args) {

		human obj = new human();
		human obj1 = new human(75,"duggu");
		System.out.println(obj1.getName() + ":" + obj1.getAge());
		//System.out.println(obj.getName() + obj.getAge());
		//obj.setAge(50);
		//obj.setName("thayna");

	}
}
class human {
	private int age;
	private String name;

	public human() { //default constructor 
		//System.out.println("i am constructor");
		age = 50;
		name = "thayna";
	}

	public human(int a,String n) { //parametrize constructor
		//System.out.println("i am constructor");
		age = a;
		 name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

