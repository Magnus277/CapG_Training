package one_to_many_Day11;

public class Demo {
public static void main(String[] args) {
	Customer c1=new Customer("Rohit",10);
	Customer c2=c1;
	System.out.print(c1+"            ");
	System.out.println(c2);
	int a=10;
	int b=a;
	System.out.println(a+"   "+b);
}
}
