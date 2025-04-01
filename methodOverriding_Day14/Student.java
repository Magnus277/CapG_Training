package methodOverriding_Day14;

public class Student extends Person {
	private int studentId;

	Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" " + this.studentId);
	}

//	public void showStudentGrade() {
//		System.out.println("Student grade is 11");
//	}
}
