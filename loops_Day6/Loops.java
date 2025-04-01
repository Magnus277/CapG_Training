package loops_Day6;

import java.util.Scanner;
import java.lang.Math;

public class Loops {
	public static void main(String[] args) {
//		for(float f=10.78f;f<12.34f;f++) {
//			System.out.println("Hello");
//		}
		
//			Factorial----->

//			System.out.println("Enter the number: ");
//			Scanner sc=new Scanner(System.in);
//			int num=sc.nextInt();
//			int product=1;
//			for(int i=num;i>=1;i--) {
//				product*=i;
//			}
//			System.out.println(product);

		// Prime
//		System.out.println("Enter the number: ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for (int i = 2; i < Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				System.out.println(num + " is Not prime");
//				break;
//			} else {
//				System.out.println(num + " is a prime");
//				break;
//			}
//		}
		
		//QS
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}
}
