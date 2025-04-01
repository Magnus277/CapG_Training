package methodOverriding_Day14;

public class Professor extends Person {
	private String specialization;

	Professor(String name, int age, String specialization) {
		super(name, age);
		this.specialization = specialization;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" " + this.specialization);
	}

//	public void designation() {
//		System.out.println("Prof's designation is senior");
//	}
}
