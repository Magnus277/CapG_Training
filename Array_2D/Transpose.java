package Array_2D;

import java.util.Scanner;


public class Transpose{
	static int row;
	static int col;
//	static int[][]transpose;
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



public static boolean isSymmetric(int[][]arr) {
	boolean flag=true;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr[i].length;j++) {
			if(arr[j][i]!=arr[i][j]) {
				flag=false;
				break;
			}
		}
		if(!flag) {
			break;
		}
	}
	if(flag) {
		return true;
}
	else {
		return false;
	}
}

	public static void main(String[] args) {
		int[][]arr=create2DArray();
		if(isSymmetric(arr)) {
			System.out.println("Transpose");
		}
		else {
			System.out.println("Not Transpose");
		
//			System.out.println();
		
	}
   }
}

