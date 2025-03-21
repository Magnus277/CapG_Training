package oops_Day9;

public class Employee {
	int id;
	String name;
	double salary;
	String companyName;
	public Employee() {
		System.out.println("This a no-arg arguments");
	}
	public Employee(int id) {
		this();
		this.id=id;
		System.out.println("This a one-arg arguments");
	}
	public Employee(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("This a two-arg arguments");
	}
	public Employee(int id,String name,double salary) {
		this(id,name);
		this.salary=salary;
		System.out.println("This a three-arg arguments");
	}
	public Employee(int id,String name,double salary,String companyName) {
		this(id,name,salary);
		this.companyName=companyName;
		System.out.println("This a four-arg arguments");
	}
}
