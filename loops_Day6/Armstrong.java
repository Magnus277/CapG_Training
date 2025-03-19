package loops_Day6;

import java.util.Scanner;
//import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
	public static boolean armstrong(int num) {
		int originalNumber=num,digits=0,sum=0;
		int temp=num;
		while(temp>0) {
			temp/=10;
			digits++;
		}
		temp=num;
		int digit;
		while(temp>0) {
			digit=temp%10;
			sum+=Math.pow(digit,digits);
			temp/=10;
		}
//		System.out.println(sum);
		return originalNumber==sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(armstrong(num));
		
	}
}
