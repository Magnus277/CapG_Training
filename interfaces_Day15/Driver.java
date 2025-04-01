package interfaces_Day15;

public class Driver {
public static void main(String[] args) {
	Vehicle b=new Bike();
	b.start();
	b.print();
//	b.utility(); //error as it is static method
	Vehicle.utility();
}
}
