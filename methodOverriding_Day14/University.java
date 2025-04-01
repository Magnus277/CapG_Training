package methodOverriding_Day14;

public class University {
	Person[] persons = new Person[5];
	static int count = 0;

	public void addPerson(Person person) {
		if (count < persons.length) {
			persons[count++] = person;
			System.out.println("Person added!");
		}
	}

	public void showPeople() {
		if (count == 0) {
			System.out.println("No persons added to display");
			return;
		}

		for (int i = 0; i < count; i++) {
			Person p = persons[i];
			p.displayInfo();
		}
	}
}
