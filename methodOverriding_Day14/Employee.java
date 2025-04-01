package methodOverriding_Day14;

public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void employeeInfo() {
		System.out.print(this.name+" "+this.salary);
	}
	
	public void jobRole() {
		
	}
}
