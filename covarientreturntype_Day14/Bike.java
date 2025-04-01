package covarientreturntype_Day14;

public class Bike extends Vehicle {
	public Vehicle getObject() {
		return new Bike(); //upcasting
	}
	
//	public Vehicle getObject() {
//		return new Bike(); //error
//	}
}
