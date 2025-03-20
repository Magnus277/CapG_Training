package scannerClass_Day5;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first number: ");
//		int num1=sc.nextInt();
//		System.out.println("Enter second number: ");
//		int num2=sc.nextInt();
//		System.out.println(num1+num2);
//		System.out.println("Enter boolean: ");
//		System.out.println(sc.nextBoolean());
//		System.out.println("Enter short: ");
//		System.out.println(sc.nextShort());
//		System.out.println("Enter long: ");
//		System.out.println(sc.nextLong());
//		System.out.println("Enter float: ");
//		System.out.println(sc.nextFloat());
//		System.out.println("Enter double: ");
//		System.out.println(sc.nextDouble());
		
		System.out.println("Enter Name: ");
//		System.out.println(sc.next()); //doesn't take characters after space, accepts single worded string
		System.out.println(sc.nextLine()); //accepts all characters as string
		
	}
}
