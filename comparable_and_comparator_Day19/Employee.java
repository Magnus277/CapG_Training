package comparable_and_comparator_Day19;

public class Employee implements Comparable {
	 int id;
	 String name;
	 double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	// public int compareTo(Object o) {
	// Employee e = (Employee) o;
	// return (int) (this.salary - e.salary); // this.salary is e1's(currently
	// // existing object) and e.salary
	// // is e2's(passed object)
	// }

	// comparing based on strings
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.name.compareTo(e.name); // compareTo() is already overridden
											// in string class to sort in
											// ascending order

	}
}
