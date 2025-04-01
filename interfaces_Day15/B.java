package interfaces_Day15;

public interface B {
	double a=30;
	
	static void message() {
		System.out.println("Welllll");
	}
	
	default void print() {
		System.out.println("Hi");
	}
}
