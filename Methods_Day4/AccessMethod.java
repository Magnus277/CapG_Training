package Methods_Day4;

public class AccessMethod {
//	public static void main(String[] args) {
//		System.out.println("main start from access method class");
//		message();
//		System.out.println("main end from access method class");
//	}
//	static void message() {
//		System.out.println("Hi from access meth");
//	}
//	static void message() {
//		System.out.println("Hi from access meth");
//	}
	public static void main(String[] args) {
		printHello();
		getMessage();
		add();
	}
	
	public static void getMessage() {
		System.out.println("Main start");
		System.out.println("Main end");
	}
	public static void printHello() {
		int i=0;
		while(i<5) {
			System.out.println("Hello");
			i++;
		}
	}
		public static void add() {
			int a=6;
			int b=8;
			int c=a+b;
			System.out.println("ADdition");
		}
	
	
}
