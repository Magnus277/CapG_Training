package Array_2D;
import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		
	
	Scanner	sc =new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int row=sc.nextInt();
	System.out.println("Enter number of columns: ");
	int cols=sc.nextInt();
	int [][] arr=new int[row][cols];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter element for "+ j +"th column of "+ i +"th row");
			arr[i][j]=sc.nextInt();
		}
	}
//	for(int k=0;k<arr.length;k++) {
//		for(int j=0;j<arr[k].length;j++) {
////			System.out.print("|" + arr[k][j]+ "|");
//		}
//		System.out.println();
//	}
//	System.out.println(Arrays.deepToString(arr));
	
	
	for(int[] rows:arr) {
			for(int elements:rows) {
			System.out.print(elements);
		}
		System.out.println();
	}
	
}
}
