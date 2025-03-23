package initializers_Day10;

public class Demo {
	static {
		System.out.println("3rd multiline static initializer");
	}
	static {
		System.out.println("1st multiline static initializer");
	}
	static {
		System.out.println("2nd multiline static initializer");
	}
	public Demo(){
		System.out.println("Constructor");
	}
	
	{   //--------------> non-static initializer, before constructor execution,it'll be executed;
		
		System.out.println("1st non st initializer");
		
	}
	{   //--------------> non-static initializer, before constructor execution,it'll be executed;
		
		System.out.println("2nd non st initializer");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main");
		Demo d1=new Demo();
		Demo d2=new Demo();
	}
}
