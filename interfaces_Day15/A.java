package interfaces_Day15;

public interface A {
	int a=10;
	
	static void message() {
		System.out.println("Well");
	}
	
	default void print() {
		System.out.println("Hey");
	}
}
