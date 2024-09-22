package ENCAPSULATION;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("******************FROM Sample1**************");
		Demo1 ref = new Demo1();
		/** private members are accessible/visible within the class only */
		//System.out.println("private accountNumber: " + ref.accountNum);
		
		/** default members are accessible/visible within the package only*/
		//System.out.println("default salary: " + ref.salary);
		
		/** protected members are accessible/visible from outside the package only with inheritance */
		Sample1 ref1=new Sample1();
		System.out.println("protected empId: " + ref1.empId);
		System.out.println("Sample1 ref1, public status: " + ref1.status);
		System.out.println("Demo1 ref, public status: " + ref.status);
	}

}
