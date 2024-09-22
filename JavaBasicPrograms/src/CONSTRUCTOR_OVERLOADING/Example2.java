package CONSTRUCTOR_OVERLOADING;

public class Example2 {


			int age;
			void display() {
				System.out.println("I am display method of Example2 class");
			}
			public static void main(String[] args) {
				Example2 obj=new Example2();//object created to load a copy non-static members into object memory
				
				System.out.println(obj.age);
				obj.display();
			}

		}
		/*
		* is similar to a method
		* but its name should be same as class name and its wont return type.
		* its use to initialize non-static members of the class
		* it will call automatically when class instance/object is created (we cant call him based on our requirement)
		* type:
		   1. default constructor: it will be written by java compiler when class doesn't have any type of constructor
		     					   it won;t have parameter as well as its body will be empty
		   
		   2. user defined constructor: it will be written by programmer while writing a program
		*/