package VariablesAndDatatypes_Day2;

public class Variables {
	static int a = 10;
	 //non static
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//modifier static
		 System.out.println(a); //prints static variable
		 System.out.println(Variables.a); //prints static/class variable
		 int a = 20;
		 System.out.println(a); //prints local variable
		 access(); 
	}
	public static void access() {
		System.out.println(a);
	}

}