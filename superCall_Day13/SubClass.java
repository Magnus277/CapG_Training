package superCall_Day13;

public class SubClass extends SuperClass {
	public String a="Deb";
	static int b=11;
	
	public void print() {
		System.out.println(super.a);
		System.out.println(a);
		
		
//		System.out.println(b); //---> Variable shadowing, subclass variable prints
//		System.out.println(super.b); //---> should be avoided
		
		
		System.out.println(SuperClass.b); // ----> Optimal
		System.out.println(b);
	}
}
