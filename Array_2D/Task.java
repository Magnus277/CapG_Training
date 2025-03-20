package Array_2D;

import java.util.Scanner;

public class Task {
	static int row;
	static int col;

	public static int[][] create2DArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		 row=sc.nextInt();
		System.out.println("Enter number of columns: ");
		 col=sc.nextInt();
		int [][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter element for "+ j +"th column of "+ i +"th row");
				arr[i][j]=sc.nextInt();
			}
				
	}
		return arr;
}
	
	public static int maxElement(int[][] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
	}
		return max;
}
	public static void main(String[] args) {
		int[][] arr;
		arr=create2DArray();
		int maxElement=(maxElement(arr));
		System.out.println("Max Element is: "+maxElement);
		
	}
	}
