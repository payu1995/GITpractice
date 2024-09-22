package variabletypes;

public class Example3 {

	//global variable
		int num1=25,num2;//NSGV
		static int num3=45,num4=55;//SGV
		
		public static void main(String[] args) {
			System.out.println("Progran starts");
			//local variable
			int result;
			//perform addition of SGV and store the result into result variable and print all of them
			result=num3+num4; // result=Example3.num3+Example3.num4;
			System.out.println("SGV num3: "+num3);
			System.out.println("SGV num4: "+num4);
			System.out.println("Local variable result: "+result);
			
			//perform addition of NSGV and store the result into result variable and print all of them
			Example3 ref=new Example3();
			result=ref.num1+ref.num2;
			System.out.println("NSGV num1: "+ref.num1);
			System.out.println("NSGV num2: "+ref.num2);
			System.out.println("Local variable result: "+result);
			System.out.println("Progran ends");
		}

	}
