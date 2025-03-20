package conditionals_statements_Day5;

import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) { // to check whether the input can be converted to int or not
			System.out.println(sc.nextInt());
		}
		else if(sc.hasNextDouble()) {
			System.out.println(sc.nextDouble());
		}
		else if(sc.hasNext()) {
			System.out.println(sc.next());
		}
		else {
			System.out.println("Invalid input"); //not mandatory to use else block in else-if ladder
		}
	}
}
