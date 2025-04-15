package generics_Day24;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return "Name: "+this.name+" id: "+this.id;
	}
	
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
}	
