package METHOD;

public class Example5 {

	public static void main(String[] args) {
		int principleAmount=550000;
		double intrest=getSimpleInterest(principleAmount, 8.5, 5);
		
		double finalAmount=principleAmount+intrest;
		System.out.println(finalAmount);
	}	
	
	static double getSimpleInterest(int p, double r,int t) {
//		double res=(p*r*t)/100;
//		return res;
		
		return (p*r*t)/100;
	}
}
/*
method with parameter: when you want to perform some logical operation and for each execution you want diff values
then its recommended to use parameter in the method

method with return type: when you want to perform some logical operation and you want method to return the result
dn its recommended to use return type
*/
