package wrapperclasses;

public class Example1 {

	public static void main(String[] args) {
		//boxing operation
		int num=25;
		Integer intObj=num;//auto-boxing operation
		Integer intObj2=(Integer)num;//explicit boxing
		System.out.println(num);
		System.out.println(intObj);
		System.out.println(intObj2);
		System.out.println(num==intObj);
		System.out.println(num==intObj2);
		//un-boxing operation
		int num2=intObj.intValue();
		System.out.println(num2);
		
		Character ch='z';//implicit/auto-boxing
		char c1=ch.charValue();//unboxing
		System.out.println(ch);
		System.out.println(c1);
	}

}
