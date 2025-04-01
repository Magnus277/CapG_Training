package interfaces_Day15;

public class Bike implements Vehicle {

	@Override
	public void print() {
		System.out.println(speed);
		System.out.println("Helelo world");
		
	}

	@Override
	public void start() {
		System.out.println("bike is starting");
		test();
	}
	
}
