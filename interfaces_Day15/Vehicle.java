package interfaces_Day15;

public interface Vehicle {
	int speed=10; //final variable by default
	
	void print(); //abstract method as default
	void start();
	
	static void utility() {
		System.out.println("Utility");
	}
	
	public static void main(String[] args) {
		utility();
//		test(); 	//cant access default methods in static context//
		
	}
		default void test() {
			System.out.println("testing");
	}
}
