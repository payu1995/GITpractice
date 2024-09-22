package array;

public class Example1 {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("************* using array now************");
//		int[] num;
//		num=new int[5];
			//or
		int[] number=new int[5];
//		System.out.println(number[0]);
//		System.out.println(number[1]);
//		System.out.println(number[2]);
//		System.out.println(number[3]);
//		System.out.println(number[4]);
		System.out.println("Elements in array: "+number.length);
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		System.out.println("************* using array-2 now************");
		int[] num= {10,20,30,40,50};
		System.out.println("Elements in array: "+num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("*****Using for each loop******");
		/*
		 * for each loop
		 * for(LHS : RHS){
		 * 
		 * }
		 * Based on RHS type LHS type will be defined
		 */
		for(int n:num) {
			System.out.println(n);
		}
	}

}


