package BLOCK;


public class Example4 {
	static int age;
	double salary;
	
	static void printAge() {
		System.out.println("SGV age: "+age);
	}
	
	Example4(){
		System.out.println("****I am zero-param cons****");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV age: "+age);
		Example4 e1=new Example4();
		System.out.println("NSGV salary: "+e1.salary);
		System.out.println("++++++++++++++++++++++++++");
		Example4 e2=new Example4();
		System.out.println("NSGV salary: "+e2.salary);
		System.out.println("Program ends");
	}
	
	{
		System.out.println("I am NSIB-1");
		salary=45000.56;
	}
	
	static
	{
		printAge();
		System.out.println("I am SIB-1");
		age=25;
	}
}
/*

{
		//block
}


block:
	doesn't have
			name
			return type
			access modifier
			
type:
from blocks we can initialize variables and also call methods 

	1. static block or SIB: use to provide important information related to program and gets executed before main()
							a class can have multiple SIB, all SIB will be executed in sequential order
			static{
			
			}
			
	2. non-static block or NSIB or IIB: use to provide important information related to object and gets executed before constructor
						a class can have multiple NSIB, all NSIB will be executed in sequential order before the constructor				
			
			{
			
			}
*/

