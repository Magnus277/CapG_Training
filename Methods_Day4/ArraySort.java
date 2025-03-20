package Methods_Day4;
import java.util.*;
public class ArraySort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter arsray elems: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter key elem: ");
		int key=s.nextInt();
		searchArray(arr,key);
	}
	public static void searchArray(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Key found at "+i);
				return; //control transfers to the method calling statement
			}
		}
		System.out.println("Key not found");
	}
}
