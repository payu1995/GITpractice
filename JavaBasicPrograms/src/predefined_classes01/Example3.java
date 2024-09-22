package predefined_classes01;

class Sample{
	int age=101;
	void display() {
		System.out.println("Displaying age of Sample class: "+age);
	}
}
public class Example3 {
	static Sample ref=new Sample();
	public static void main(String[] args) {
		Example3.calling();
		
//		Sample ref=new Sample();
//		ref.display();
		
		Example3.ref.display();
	//classname.staticReferanceVariableOfSample.nonstaticMethodOfSample
		System.out.println("Hello");
		System.err.println("Bye");
	//classname.staticReferanceVariableOfPrintStream.nonstaticMethodOfPrintStream
	}
	
	static void calling() {
		System.out.println("Calling from Example3");
	}

}
