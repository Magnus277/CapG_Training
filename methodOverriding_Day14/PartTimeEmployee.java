package methodOverriding_Day14;

public class PartTimeEmployee extends Employee {
	private int workingHours;

	public PartTimeEmployee(String name, int salary, int workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}

	public void employeeInfo() {
		super.employeeInfo();
		System.out.println(" " + this.workingHours);

	}

	public void jobDesignation() {
		System.out.println("Associate Software Engineering");

	}

	public void jobRole() {
		System.out.println("Job Role of part time employee is cloud engineer");
	}
}
