package abstraction_Day15;

public class Driver {
	public static void main(String[] args) {
//		Vehicle v=new Vehicle();//cannot be instantiated as the class is made abstract
		Vehicle v1=new Bike();
		v1.start();
		Vehicle v2=new Car();
		v2.start();
	}
}
