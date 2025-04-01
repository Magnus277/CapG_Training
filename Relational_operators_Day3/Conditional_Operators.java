package Relational_operators_Day3;

public class Conditional_Operators {
	public static void main(String[] args) {

//		System.out.println(10>20? "10 is greater":"20 is greater");

//		System.out.println(10>20? "System.out.println("Hello")":"20 is greater"); //error
//		int a,b,c;
//		a=2;
//		b=5;
//		c=90;
//		System.out.println((a>b?a:b)>c?(a>b?a:b):c); //prints the biggest num bw the three

//		System.out.println((a>b)&&(a>c)?a:b>c?b:c); // we can use ops other than relational ops, just like we used AND op here
//		
//		int res=a++ + ++a + ++a + b++ - ++b -a++ + ++a - b++;

//		int res=a++ - --a - a-- + b-- + ++b + ++a - ++b + b--;

//		System.out.println(res);

//		byte b=10;
// 		b=b+10; //error as add bw variable and literal results in integer...
		
//		b+=5; //compound assignment operator doesnt convert the result into integer,so we can store the result inside b as it is still in byte type
//		System.out.println(b);
		
//		int a=10;
//		long l=a;
//		System.out.println(l); //----> example of widening
		
		
//		byte c=10;
//		short s=c;
//		System.out.println(s); //widening
		
		
//		int d=10;
//		float f=d;
//		System.out.println(f); //widening
		
		
//		float m=10/0;
//		System.out.println(m); //-----> error, arithmetic exception
		
		
//		float f = 10.5f;
//		long l=(long)f;
//		System.out.println(l); //though this operation is narrowing down as float is a bigger datatype than long as it stores both int and decimal part, but it will work
		
//		short s=10;
//		byte b=(byte)s;  	//narrowing down typecasting
//		System.out.println(s);
		double d=65.90;
		char c=(char)d;
		System.out.println(c);
	}
}
