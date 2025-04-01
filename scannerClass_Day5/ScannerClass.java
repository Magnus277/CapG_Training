package scannerClass_Day5;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int x = sc.nextInt(); // will leave a newline /n after taking input from the user
//		sc.nextLine(); // used to consume the leftover /n in the buffer storage
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

		 Scanner sc1 = new Scanner("10 20 30");
	        System.out.println(sc1.next()); // 10
	        System.out.println(sc1.next()); // 20
	        System.out.println(sc1.next()); // 30
	        sc1.close(); 

	        Scanner sc2 = new Scanner("10,20,30");
	        sc2.useDelimiter(",");
	        System.out.println(sc2.next()); // 10
	        System.out.println(sc2.next()); // 20
	        System.out.println(sc2.next()); // 30
	        sc2.close();

	        Scanner sc3 = new Scanner("Hel,lo world,good evening");
	        sc3.useDelimiter(",");
	        System.out.println(sc3.next()); // Hel
	        System.out.println(sc3.next()); // lo world
	        System.out.println(sc3.next()); // good evening
	        sc3.close();
	}
}