package Relational_operators_Day3;
import java.util.*;

public class swappingtwonums {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
