package wrapperClass_Day18;

public class WrapperClasses {
	public static void main(String[] args) {
		int i=10;
		Integer x=new Integer(i); //boxing
		System.out.println("x: "+x);
		Integer z=Integer.valueOf(i); //boxing
		
//		Integer y=i; //auto-boxing
//		System.out.println("y: "+y);
		
//		boolean b=false;
//		Boolean b1=Boolean.valueOf(b);
//		System.out.println(b);
//		System.out.println(Boolean.valueOf(b));
		
		Integer y=30; //auto-boxing
		System.out.println("y: "+y);
		
		int a=y.intValue(); //unboxing
		Boolean flag=true;
		boolean b=flag.booleanValue();
		System.out.println(a+" "+b);
		
		Character ch='a'; //autoboxing
		char c=ch; //auto unboxing
		
		Integer i1=10;
		Integer j=10;
		System.out.println(i1==j); //always automatically unboxed
		
		String s="123";
		int i2=Integer.parseInt(s);
		System.out.println(i2);
		String s1="true";
		Boolean b1=Boolean.parseBoolean(s1); //parsing
		boolean b2=Boolean.parseBoolean(s1); //parsing+auto unboxing
		System.out.println(b1);
		
	}
}
