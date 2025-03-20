package methodOverloading_Day5;

public class Method_Overloading {
	public static void main(String[] args) {
		add(10,20,40.56f);
		add(10,20,40);
//		add(10,20,30,40);//method overloading is the example of compile time polymorphism as the choosing of methods is decided in compilation
		
	}
//	public static void add(int a,int b) {
//		System.out.println("First");
//		System.out.println(a+b);
//	}
//	public static void add(int a,int b,int c,int d) {
//		System.out.println("Second");
//		System.out.println(a+b+c+d);
//	}
//	public static void add(byte a,byte b) {
//		System.out.println("third");
//		System.out.println(a+b); //will not run as the raw literals are considered to be integer by default
//	}
//	public static void add(int a,int b,float c) {
//		System.out.println("Fourth");
//		System.out.println(a+b+c);
//	}
	public static void add(float a,float b,float c) {
		System.out.println("Last");
		System.out.println(a+b+c);
	}
}
