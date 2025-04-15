package class_object_Day16;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rohit", 2000);
//		 System.out.println(e1); //toString() is implicitly called
		Employee e2 = new Employee(1, "Rohit", 2000);
//		 System.out.println(e2.toString());
//		System.out.println(e1 == e2); // false as every object is unique with
//										// their own address
		System.out.println(e1.equals(e2)); // equality based on object reference
//		System.out.println(e1.equals("Hello")); // equality based on object reference addresses
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		String s="Rohit";
		System.out.println(s.hashCode());
		
		Employee e3=e1.cloneEmployee(e1);
		Employee emp1=e2.cloneEmployee(e2);
		
		System.out.println(e1);
		System.out.println();
		
		Object o=e1;
		System.out.println(o);
		
		
	}
}
