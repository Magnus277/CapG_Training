package one_to_many_Day11;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		Bank bank = new Bank(size, "SBI");
		boolean flag = true;

		while (flag) {
			System.out.println("Enter 1 to add customer\nEnter 2 to display customers\nEnter 3 to remove Customer" + "\nEnter 4 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter customer id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter customer name: ");
				String name = sc.nextLine();
				Customer customer = new Customer(name,id);
				bank.addCustomers(customer);

			case 2:
				bank.displayCustomers();
				break;

			case 3:
				flag = false;
				break;
			}
		}
	}
}
