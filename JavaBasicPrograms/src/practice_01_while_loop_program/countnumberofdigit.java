package practice_01_while_loop_program;

public class countnumberofdigit {
	public static void main(String[] args) { 

//count number of digit in an integer using while loop

int i = 0, num = 000325123;
while(num!=0) {
	num /= 10;
	++i;
}
System.out.println("count number of digit: " + i);
}
}

