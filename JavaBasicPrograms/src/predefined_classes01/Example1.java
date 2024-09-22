package predefined_classes01;

class Demo{
	void display() {
		System.out.println("I am display of Demo class");
	}
}
public class Example1 extends Demo{

	public static void main(String[] args) {
		Example1 ref1=new Example1();
		System.out.println("ref1 with explicit toString(): "+ref1.toString());
		System.out.println("ref1 address with hashCode(): "+ref1.hashCode());
		Example1 ref2=new Example1();
		System.out.println("ref2 without(implicit) toString(): "+ref2);
		System.out.println("ref2 address with hashCode(): "+ref2.hashCode());		
		System.out.println("Camparing ref1 with ref2 based address: "+ref1.equals(ref2));
		
		Example1 ref3=ref2;
		System.out.println("ref3 without(implicit) toString(): "+ref3);
		System.out.println("ref3 address with hashCode(): "+ref3.hashCode());		
		System.out.println("Camparing ref2 with ref3 based address: "+ref2.equals(ref3));
		
		Demo d1=new Demo();
		System.out.println("d1 without(implicit) toString(): "+d1);
		System.out.println("d1 address with hashCode(): "+d1.hashCode());
		
	}
	void calling() {
		System.out.println("Calling from Example1 class");
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
