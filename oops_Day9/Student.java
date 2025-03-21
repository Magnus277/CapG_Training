package oops_Day9;

public class Student {
	int id;
	String name;
	double marks;
	String collegeName;
	
	public Student() {
		System.out.println("This is a no arg constructor");
	}
	public Student(int id) {
		this();
		this.id=id;
		System.out.println("This is a one arg constructor");
	}
	public Student(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("This is a two arg constructor");
	}
	public Student(int id,String name,String collegeName) {
		this(id,name);
		this.collegeName=collegeName;
		System.out.println("This is a three arg constructor");
	}
	
	public Student(int id,String name,String collegeName,double marks) {
		this(id,name,collegeName);
		this.marks=marks;
		System.out.println("This is a four arg constructor");
	}
	
	
	public void studying() {
		System.out.println(name+" Studying");
	}
}
