package scannerClass_Day5;

import java.util.Scanner;

public class ScannerClass2 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner("45, 20, 30");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		if(sc.hasNextInt()) { // to check whether the input can be converted to int or not
			System.out.println(sc.nextInt());
		}
		else {
			System.out.println("Input mismatch");
		}
	}
}
