package conditionals_statements_Day5;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
//		calc.addMenu();
//		calc.subMenu();
//		calc.mulMenu();
//		calc.divMenu();
		System.out.println("Enter 1 to add\nEnter 2 to sub\nEnter 3 to mul\nEnter 4 to div");
		Scanner s=new Scanner(System.in);
			int choice = s.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Addition");
				Calculator.addMenu();
				break;		 	
			case 2:
				System.out.println("Subtraction");
				Calculator.subMenu();
				break;
			case 3:
				System.out.println("Multiply");
				Calculator.mulMenu();
				break;
			case 4:
				System.out.println("Division");
				Calculator.divMenu();
				break;
			default:
				System.out.println("Invalid choice");
			}
		
	}
}
