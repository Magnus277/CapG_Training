package exception_handling_DAy17;

public class ExceptionPropagation {
	public static void alpha() {
		System.out.println("Alpha method");
		beta();
	}
	public static void beta() {
		System.out.println("Beta method");
		gamma();
	}
	public static void gamma() {
		System.out.println("Gamma method");
		try {
		System.out.println(10/0);
		System.out.println("End of gamma");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled!");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		alpha();
	}
	
}
