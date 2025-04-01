package methodOverriding_Day14;

import java.util.Scanner;

public class DriverUni {
	static Scanner sc = new Scanner(System.in);
	static University university = new University();

	public static void main(String[] args) {
		boolean flag = true;

		while (flag) {
			System.out.println("Enter 1 to add person\nEnter 2 to show people\nEnter 3 to exit");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {

				case 1 :
					addPerson();
					break;

				case 2 :
					university.showPeople();

				case 3 :
					flag = false;
					break;

			}
		}
	}

	public static void addPerson() {
		System.out.println("enter 1 to add student\nEnter 2 to add professor");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
			case 1 : {
				System.out.println("Enter student name: ");
				String name = sc.nextLine();
				System.out.println("Enter student age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student id: ");
				int id = sc.nextInt();
				Student student = new Student(name, age, id);
				university.addPerson(student);
				break;
			}

			case 2 :
				System.out.println("Enter Prof name: ");
				String name = sc.nextLine();
//				sc.nextLine();
				System.out.println("Enter Prof specialization: ");
				String specialization = sc.nextLine();
//				sc.nextLine();
				System.out.println("Enter Prof age: ");
				int age = sc.nextInt();

				Professor professor = new Professor(name, age, specialization);
				university.addPerson(professor);
				break;

		}
	}
}
