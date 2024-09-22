package INHERITANCE;

//parent class
class vehicle07 {
	public void wheels() {
		System.out.println("I have wheels");
	}
}

//first child class of vehicle class
class bike07 extends vehicle07 {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}

//second child class of vehicle class
class Car1 extends vehicle07 {
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}

//third child class of vehicle class
class scooter extends vehicle07 {
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Inheritance4 {
	public static void main(String[] args) {

		Car1 c = new Car1(); // object of car class
		c.wheels();
		c.countwlc();
		bike07 b = new bike07();// object of bike class
		b.wheels();
		b.countwl();
		scooter sc = new scooter(); // object of scooter class
		sc.countwls();
		sc.wheels();
	}
}