package methodOverriding_Day14;

public class DriverTask {
	public static void main(String[] args) {
		Employee e = new FullTimeEmployee("Debayan", 50000, 5000);
		// e.employeeInfo();
		Employee e1 = new PartTimeEmployee("Raj", 45000, 12);
		// e1.employeeInfo();

		// ((FullTimeEmployee)e).jobRole(); //downcasting
		// ((PartTimeEmployee)e1).jobDesignation();

		details(e1);

	}
	static void details(Employee e) {

		if (e instanceof FullTimeEmployee) {
			e.jobRole();
		} else {
			e.jobRole();
//			e.jobDesignation(); //cant access as parent class doesnt have this method
			((PartTimeEmployee) e).jobDesignation();
		}
	}
}
