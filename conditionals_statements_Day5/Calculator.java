package conditionals_statements_Day5;

import java.util.Scanner;

public class Calculator {
	public static void addMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Parameters: ");
		int para = s.nextInt();
		int i = 1;
		while (i > 0) {
			switch (para) {
			case 2: {
				double num1 = s.nextDouble();
				double num2 = s.nextDouble();
				System.out.println(num1 + num2);
				break;
			}

			case 3: {
				double num3 = s.nextDouble();
				double num4 = s.nextDouble();
				double num5 = s.nextDouble();
				System.out.println(num3 + num4 + num5);
				break;
			}
			}
		}
	}

	public static void subMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Parameters");
		int para = s.nextInt();
		int i = 1;
		while (i > 0) {
			switch (para) {
			case 2: {
				double num1 = s.nextDouble();
				double num2 = s.nextDouble();
				System.out.println(num1 - num2);
				break;
			}
			default: {
				System.out.println("Invalid choice");
				break;
			}

//			case 3:
//				double num3=s.nextDouble();
//				double num4=s.nextDouble();
//				double num5=s.nextDouble();
//				System.out.println(num3-num4-num5);
			}
		}
	}

	public static void mulMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Parameters");
		int para = s.nextInt();
		switch (para) {
		case 2: {
			double num1 = s.nextDouble();
			double num2 = s.nextDouble();
			System.out.println(num1 * num2);
			break;
		}

		case 3: {
			double num3 = s.nextDouble();
			double num4 = s.nextDouble();
			double num5 = s.nextDouble();
			System.out.println(num3 * num4 * num5);
			break;
		}
		}
	}

	public static void divMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Parameters");
		int para = s.nextInt();
		switch (para) {
		case 2: {
			double num1 = s.nextDouble();
			double num2 = s.nextDouble();
			if (num2 != 0) {
				double res = num1 / num2;
				System.out.println(res);

			} else {
				System.out.println("Denominator is zero,can't divide");
			}
			break;
		}
		default: {
			System.out.println("Invalid choice");
			break;
		}

//					case 3:
//						double num3=s.nextDouble();
//						double num4=s.nextDouble();
//						double num5=s.nextDouble();
//						System.out.println(num3*num4*num5);
		}
	}
//	System.out.println("Thank you for using our Calculator App");
}
