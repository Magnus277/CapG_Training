package method_chaining_Day12;

public class Student {
	String name;
	int id;
	
	public Student setName(String name) {
		this.name=name;
//		Student s=new Student();
		return this; //this keyword contains the address of the currently existing object
	}
	
	
	public Student setId(int id) {
		this.id=id;
		return this;
	}
	
	
	public void display() {
		System.out.println(this.name+" "+this.id);
	}
}