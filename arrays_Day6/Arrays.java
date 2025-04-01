package arrays_Day6;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++) {
				System.out.println("Enter "+(i+1)+"th element: ");
			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);
		}
		for(int i:arr) {
			System.out.print(i+ " " );
		}
		
	}
}
