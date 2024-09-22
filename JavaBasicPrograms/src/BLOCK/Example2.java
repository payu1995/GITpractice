package BLOCK;



public class Example2 {

	Example2(){
		System.out.println("****I am zero-param cons****");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
		System.out.println("++++++++++++++++++++++++++");
		Example2 e2=new Example2();
		System.out.println("Program ends");
	}
	
	{
		System.out.println("I am NSIB-1");
	}
	
	{
		System.out.println("I am NSIB-2");
	}
	
	{
		System.out.println("I am NSIB-3");
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
	1. static block or SIB: use to provide important information related to program and gets executed before main()
							a class can have multiple SIB, all SIB will be executed in sequential order
			static{
			
			}
			
	2. non-static block or NSIB or IIB: use to provide important information related to object and gets executed before constructor
						a class can have multiple NSIB, all NSIB will be executed in sequential order before the constructor				
			
			{
			
			}
*/
