package conditionals_statements_Day5;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Enter 1 to add\nEnter 2 to sub\nEnter 3 to mul\nEnter 4 to div");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1: // either pass a value or exp
			System.out.println("Addition");
			break;
//		 		System.out.println("Hello"); //----> unreachable code as used after break statement 
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiply");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
