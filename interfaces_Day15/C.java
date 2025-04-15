package interfaces_Day15;

public interface C extends A, B {
	public static void main(String[] args) {
		// this.check(); //cant access a default method in static context

	}
	default void check() {
		// System.out.println(a); // error as both parent interfaces has
		// variable
		// with same name
		System.out.println(A.a);
		// message(); //static meths are not inherited

		A.message();
		B.message();
		print();
	}

	default void print() {
		A.super.print(); // overriding print() to access A type print()
	}

	// *if we create another default method with same name as parent then the
	// compiler doesnt throw any error as the new default method will be
	// belonging to type C and both default methods from type A and B will be
	// shadowed.s
}
