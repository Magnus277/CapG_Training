package Methods_Day4;

public class TypesofMeths {
	static int x;
	static int sum;
	public static void main(String[] args) {
		System.out.println(x);
//		System.out.println(add());
		double res1=add(10,11.78); //10 and 11 are actual args
		System.out.println(res1);
//		message();
	}
	
	//methods with no arg and no return type
//	public static void message() {
//		System.out.println("Hello World");
//		x=10;
//	}
	
//	//methods with no arg and has a return type
//	public static int add() {
//		double a=10.0;
//		double b=20.0;
//		double res=a+b;
//		return (int)res;
//	}
	//method with arg but no return type
	
	public static void add(int num1,int num2) { //num1 and num2 are formal args
		sum=num1+num2;
//		return sum; // --->error as there shall be no return type
	}
	public static double add(int num1,double num2) { //num1 and num2 are formal args
		double res=num1+num2;
		return res;
	}
}
