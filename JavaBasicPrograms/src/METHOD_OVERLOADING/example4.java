package METHOD_OVERLOADING;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		example4 ref=new example4();
		ref.printCoreJavaTopics();
		System.out.println("Reverse number is: "+ref.getReverse(123));
		ref.printPrimeNumbersFromGivenRange(15, 30);
	}

	//TODO: WAM to print CoreJava Topic covered till now
	void printCoreJavaTopics() {
		System.out.println("Basic Java Concepts");
		System.out.println("Variables");
		System.out.println("Canditions & Loops");
		System.out.println("Static and Non-static");
		System.out.println("Methods");
	}	
	//TODO: WAM to get reverse number of given number
	public int getReverse(int num) {
		System.out.println("Original number is: "+num);
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}	
	//TODO: WAP to print prime number between given range
	public void printPrimeNumbersFromGivenRange(int start, int end) {	
		System.out.println("*********Prime numbers between "+start+" to "+end+"*****************");
		for(;start<=end;start++) {
			int ct=0;
			for(int i=1;i<=start;i++) {
				if(start%i==0) {
					ct++;
				}
			}
			if(ct==2) {
				System.out.println("Prime number is: "+start);
			}
		}
	}
	
}