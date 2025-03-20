package scannerClass_Day5;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
//		Scanner sc = new Scanner("10 20 30");
//		Scanner sc = new Scanner("10,20,30");
		Scanner sc = new Scanner("Hel,lo world,good evening");
		sc.useDelimiter(",");
//		System.out.println("Enter a number");
//		int x = sc.nextInt(); // will leave a newline /n after taking input from the user
////		sc.nextLine(); // used to consume the leftover /n in the buffer storage
//		System.out.println(x);
//		System.out.println("Enter a string");
//		String s = sc.nextLine();
//		System.out.println(s);
//		System.out.println("Enter a number");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int z=sc.nextInt();
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(sc.next());
//		System.out.println(sc.next()); //any data type given in the scanner constructor will be used by the next() to retrive data
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
	}
}