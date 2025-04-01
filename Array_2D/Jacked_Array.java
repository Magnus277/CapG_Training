package Array_2D;

import java.util.Scanner;

public class Jacked_Array {
	public static int[][] createJaggedArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		int[][] arr=new int[rows][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter number of columns for row "+(i+1)+ ":");
			int cols=sc.nextInt();
			arr[i]=new int[cols];
		}
		return arr;
	}
	public static void jaggedArrayInput(int[][]arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter element for "+j+ "th column of "+i+ "th row");
			arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void jaggedArrayTraversal(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][]jaggedArray=createJaggedArray();
		
		jaggedArrayInput(jaggedArray);
		jaggedArrayTraversal(jaggedArray);
	}
}
