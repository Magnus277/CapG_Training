package exception_handling_DAy17;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
//		try {
//			int x=sc.nextInt();
//			int y=sc.nextInt();
//			System.out.println(x/y);
//		}
//		catch(Exception e) {
//			System.out.println("exception handled");
//			
//		}
//		finally {
//			sc.close();
//			System.out.println("Finally block");
//		}
		
		try(Scanner sc2 = new Scanner(System.in)){
			int x=sc2.nextInt();
			int y=sc2.nextInt();
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println("exception handled");
			
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
