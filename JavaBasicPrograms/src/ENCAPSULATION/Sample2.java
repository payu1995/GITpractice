package ENCAPSULATION;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("******************FROM Sample1**************");
		Demo1 ref = new Demo1();
		/** private members are accessible/visible within the class only */
		//System.out.println("private accountNumber: " + ref.accountNum);
		
		/** default members are accessible/visible within the package only*/
		//System.out.println("default salary: " + ref.salary);
		
		/** protected members are accessible/visible from outside the package only with inheritance */
		//System.out.println("protected empId: " + ref.empId);
		
		/** public member are accessible/visible from anywhere */
		System.out.println("Demo1 ref, public status: " + ref.status);
		
		Demo1 ref1 = new Demo1();
		System.out.println("Demo1 ref1, public status: " + ref1.status);
	}

}
