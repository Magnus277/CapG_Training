package superCall_Day13;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.print(this.name + " " + this.age);
	}
}
