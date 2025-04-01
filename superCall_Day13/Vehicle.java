package superCall_Day13;

public class Vehicle {
	String name;
	String engineType;
	public Vehicle(String name, String engineType) {
		this.name = name;
		this.engineType = engineType;
		System.out.println("Parent");
	}
}
