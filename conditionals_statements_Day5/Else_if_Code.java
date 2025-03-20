package conditionals_statements_Day5;

import java.util.Scanner;

public class Else_if_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
//		if (num > 0 && num % 2 == 0) {
//			System.out.println("Positive Even");
//		}
//		else if (num < 0 && num % 2 == 0) {
//			System.out.println("Negative Even");
//		}
//		else if (num > 0 && num % 2 != 0) {
//			System.out.println("Positive Odd");
//		}
//		else if (num < 0 && num % 2 != 0) {
//			System.out.println("Negative Odd");
//		}
//		else {
//			System.out.println("Invalid, entered number is 0 or negative 0");
//		}
		if(num>0) {
			if(num%2==0) {
				System.out.println("Positive even");
			}
			else {
			System.out.println("Positive odd");
			}
		}
		else if(num<0) {
			if(num%2==0) {
				System.out.println("Negative even");
			}
			System.out.println("Negative odd");
			
		}
	}
}
