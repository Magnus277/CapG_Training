package static_nonStaticVars_Day9;

public class Demo2 {
	public Demo2() {
		
	}
	public static void main(String[] args) {
		System.out.println(Demo1.id);
//		System.out.println(Demo1.name); //---> cannot access in another class as it is non-static
		Demo1 d=new Demo1();
		System.out.println(d.name);
	}
}
