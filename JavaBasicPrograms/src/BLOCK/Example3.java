package BLOCK;



public class Example3 {

	Example3(){
		System.out.println("****I am zero-param cons****");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 e1=new Example3();
		System.out.println("++++++++++++++++++++++++++");
		Example3 e2=new Example3();
		System.out.println("Program ends");
	}
	
	{
		System.out.println("I am NSIB-1");
	}
	
	static
	{
		System.out.println("I am SIB-1");
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