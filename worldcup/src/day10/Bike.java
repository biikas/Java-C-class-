package day10;

public class Bike extends Vehicle{
	void horn() {
		System.out.println("Vroom vroom");
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.horn();
	}
}
