package predefined_classes01;



class Demo1{
	void display() {
		System.out.println("I am display of Demo1 class");
	}
}
public class Example2 extends Demo{

	public static void main(String[] args) {			
		Demo1 d1=new Demo1();
		System.out.println("d1 without(implicit) toString(): "+d1);
		System.out.println("d1 address with hashCode(): "+d1.hashCode());		
		Demo1 d2=new Demo1();
		System.out.println("d2 without(implicit) toString(): "+d2);
		System.out.println("d2 address with hashCode(): "+d2.hashCode());		
		System.out.println("Camparing d1 with d2 based address: "+d1.equals(d2));
		
		Example2 ref1=new Example2();
		System.out.println("ref1 without(implicit) toString(): "+ref1);
		System.out.println("ref1 address with hashCode(): "+ref1.hashCode());
		Example2 ref2=new Example2();
		System.out.println("ref2 without(implicit) toString(): "+ref2);
		System.out.println("ref2 address with hashCode(): "+ref2.hashCode());
		System.out.println("Camparing ref1 with ref2 based address: "+ref1.equals(ref2));
	}
	
	public boolean equals(Object obj) {
		return true;
	}
	public String toString() {
		return "Hello";
	}
	public int hashCode() {
		return 101;
	}
}
/*
Object class: 
	parent most/super most class in java, directly or indirectly inherited by all java classes mainly
	created by programmer
	this class belongs to java.lang package that will by default available in each java hence no need to import it
	
	toString(): give string representation of java object
			fullyqualifiedclassname@hexadecimaladdress
			return type: String
			access modifier: public
	
	equals(Object obj): use to compare two objects based on address
			return type: boolean
			access modifier: public
	
	hashCode(): help us to convert hexadecimaladdress into number
			return type: int
			access modifier: public
*/
