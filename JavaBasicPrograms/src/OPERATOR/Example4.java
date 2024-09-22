package OPERATOR;

public class Example4 {

	public static void main(String[] args) {
		int x=10,y;
		y=x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		y=--x;
		//x=9 | y=9
		
		y=0;
		y=x--;
		//x=8 | y=9
		
		y=0;
		y=++x;
		//x=9 | y=9
		
		y=0;
		y=x++;
		//x=10 | y=9
	}

}
