package exception_handling_DAy17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagation2 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	try {
	System.out.println("Enter two numbers: ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println(x/y);
}
	catch(ArithmeticException e){
		System.out.println("Arithmetic exception handled");
	}
	catch(InputMismatchException e) {
		System.out.println("input mismatch exception handled");
		
	}
	
	
	try {
		sc.nextLine();
		int[] arr= {1,2,3,4,5};
		System.out.println("Enter the index to access: ");
		System.out.println(arr[sc.nextInt()]);
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("out of bounds exception handled");
		
	}
	try {
		Class.forName("Demo");
	}
	catch(Exception e) { //cant use generic catch block at first as it will cause unreachable code error
		System.out.println("ClassNotFoundException handled");
	}
}
 
}
