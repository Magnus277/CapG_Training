package exception_handling_DAy17;

public class Child extends Parent {
	// void demo() throws ArithmeticException { //if the super class method is
	// throwing an exception then the
	// subclass overriden method must also throw the same exception or the
	// child type of that exception and not parent type 
	// System.out.println("Child");
	// }

	void demo() {
		System.out.println("Child"); // if a parent class throwing an
										// exception,then
		// the child class need not throw an exception
		// in the overidden method
	}
	public static void main(String[] args) {
	
		
	}
}
