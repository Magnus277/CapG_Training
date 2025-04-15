package generics_Day24;
import java.util.HashMap;

public class Employee3<T> {
	T data1; 
	T data2;

	Employee3(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public String toString() {
//		System.out.println(data1 + data2); //error as the variable types can be anything
		return data1 + "  " + data2;
	}
	
	public static <T> void print(T[] arr) {
		for(T i:arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Employee3<Integer> e1 = new Employee3<Integer>(10, 20);
		System.out.println(e1.data1+e1.data2);
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		
		Employee3<Boolean> e2 = new Employee3<Boolean>(true, false);
//		System.out.println(e2.data1+e2.data2); //error as arithmetic op cant be performed bw two boolean type of operands
		
		Integer[] arr1= {1,2,3,4,5};
		String[] arr2= {"hello", "world", "demo"};
		
		print(arr1);
		print(arr2);
	
	}
}
