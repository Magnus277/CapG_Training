package static_nonStaticVars_Day9;

public class Demo1 {
	static int id=0;
	String name="Deb";
	public Demo1() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		System.out.println(id);
//		System.out.println(name); //----> need to create object reference to use non-static variable
		Demo1 dm=new Demo1();
		System.out.println(dm.name); //----> need to create object reference to use non-static variable
	}
}
