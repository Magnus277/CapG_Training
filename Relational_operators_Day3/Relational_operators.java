package Relational_operators_Day3;
import java.util.*;

public class Relational_operators {	
	public static void main(String[] args) {
//	System.out.println(10>10.5); //relational operators automatically converts 10.5 double type to integer type or 10 int type to 10.0 double type to compare
//	System.out.println("Rohit">="Ram"); //Error
	String s1="hello";
	String s2="hello";
//	
//	System.out.println(s1==s2); //true
//	System.out.println(true==true); //true
	Scanner sc=new Scanner(System.in);
//	
//	
	int num=sc.nextInt();
	if(num>0 && num%2==0) {
		System.out.println("Positive even");
	}
	else if(num<0 && num%2==0){
		System.out.println("Negative even");
	}
	else if(num>0 && num%2!=0){
		System.out.println("Positive odd");
	}
	else if(num<0 && num%2!=0){
		System.out.println("Negative odd");
	}
}
}
