package abstraction_Day15;

public abstract class Vehicle {
	static int a = 10;
	int b = 20;
	
	public abstract void start();
	public abstract void message();

	void demo() {
		System.out.println("welcome");
	}

	static void print() {
		System.out.println("Hello world");
	}

	// abstract int a=10; // errror as a variable cannot be made as abstract

	// static abstract void print(); //error as we cannot make a static method
	// as abstract, static methods cant be overridden and abstract methods need
	// to be overridden to use.

}
