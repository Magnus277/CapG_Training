package generics_Day24;

import java.util.HashMap;

public class Employeee<T,K> {
	T data1;
	K data2;
	
	Employeee(T data1,K data2){
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString() {
		
		return data1+"  "+data2;
	}
	
	public static void main(String[] args) {
//		Employeee e1=new Employeee(10,"Hello"); // no error as will be considered to object class
		Employeee<Integer,Integer> e1=new Employeee<Integer,Integer>(10,10); //must accept integer type
//		System.out.println(e1);
//		System.out.println(e1.data1 instanceof Object);
//		System.out.println(e1.data2 instanceof Integer);
		
		
		Employeee<Integer,String> e2=new Employeee<Integer,String>(10,"Hell2"); //must accept integer type
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(null, null);
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		
		hm2.put(10, 7);
		
//		hm2.put("Hello", null);  //---->error
	
	}
}
