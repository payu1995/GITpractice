package variabletypes;

public class Example1 {

	//global variable
		static int age;//static global variable | default value 0
		double salary;//non-static global variable |default value 0.0
		public static void main(String[] args) 
		{
			//local variable
			int num1=10,num2;
			System.out.println("Local variable num1: "+num1);
			//System.out.println("Local variable num2: "+num2);//compile time error at its not initialized

		}	
	}
	/*
	Variable types:
		1.local variable: 
			* variable declare inside the method/constructor body known as local variable
			* accessible within that method/constructor
			* memory: no separate memory given to them
			* default value: any local variable should be initialize before its use because they won;t have any default value
		
		2.global variable:
			* variable declare outside the method/constructor body but present in class body known as global variable
			* default value: these variable will get default value based on data type if not initialed but used
				- byte,short,int,long --->0
				- float,double --->0.0
				- boolean---> false
				- char ---> (single character space)
			
			* type of global variables:
				- static global variable
					* any global variable declare with static keyword know as static global variable
					* these variables are also know as class variable because they are loaded into the memory at time of
					  compilation when .class file is getting generated
					* accessible: we can access them in following ways
						- directly from another static method
						- standard: using classname
								classname.variablename
								Example1.age=25;
								System.out.println(Example1.age);
					* Memory: these variable get single memory allocation			
				
				- non-static global variable
					* any global variable declare without static keyword know as non-static global variable

	*/
