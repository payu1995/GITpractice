package variabletypes;

public class Example2 {

	//global variable
		static int age;//static global variable | default value 0
		double salary;//non-static global variable |default value 0.0
		public static void main(String[] args) 
		{
			//local variable
			int num1=10,num2;
			System.out.println("Local variable num1: "+num1);
			//System.out.println("Local variable num2: "+num2);//compile time error at its not initialized
			
			//accessing non-static global variable
			//System.out.println("NSGV salary: "+salary);//compile time error as non-static member are not yet available in the momery
			
//			Example2 ref;//declaration
//			ref=new Example2();//initialization
				//or
			Example2 ref=new Example2();
			System.out.println("with ref,NSGV salary: "+ref.salary);//0.0
			ref.salary=45000.56;
			System.out.println("with ref,Updated,NSGV salary: "+ref.salary);//45000.56
			
			Example2 ref2=new Example2();
			System.out.println("with ref2,NSGV salary: "+ref2.salary);//
			
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
					* these variables are also known as class variable because they are loaded into the memory at time of
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
					* these variables are also known as instance/object member as they are loaded in the memory at the time
					  of execution when instance/object is created.
					  - instance/object creation:
					  		classname referenanceVariable;
					  		referenanceVariable=new classname();
					  				//or
					  		classname referenanceVariable=new classname();
					* accessible: we can access them in following ways
						- directly from another non-static method
						- standard: using instance/object
							
							Example2 ref;
							ref=new Example2();
								//or
						 	Example2 ref=new Example2();
							
							ref.nonstaticVariableName=25;
							System.out.println(ref.nonstaticVariableName);
					* Memory: we can create multiple instances/objects of a class for each object creation a copy of non-static
							member will be loaded into the object memory
							- a change made in one instance/object won't impact another object
	*/
