package inheritance_Day12;

public class DriverClass {
	public static void main(String[] args) {
//		Parent p=new Parent();
		Child c=new Child();
		System.out.println(c.b);
		System.out.println(c.a);
		c.print();
		c.message();
	}
}
