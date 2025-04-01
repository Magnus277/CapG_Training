package inheritance_Day12;

public class Child extends Parent {
	void display() {
		System.out.println(b); //method should be non st as nonstatic vars cant be accessed in st context 
		System.out.println(a);
		message(); // non st methods are inherited
		print(); //st methods are also getting inherited
	
	}
}
