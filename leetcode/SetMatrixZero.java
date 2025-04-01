package leetcode;

public class SetMatrixZero {
	public static void main(String[] args) {
		int[][]matrix= {{1,1,1},{1,0,1},{1,1,1}};
		int[][]temp=new int[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix.length;j++) {
			for(int j=0;j<matrix[0].length;j++) {
				temp[i][j]=matrix[i][j];
			}
		}
		
		int row=temp.length;
		int col=temp[0].length;
		
		for(int i=0;i<matrix.length;j++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					for(int k=0;k<col;k++) {
						temp[i][k]=0;
					}
					
					for(int k=0;k<row;k++) {
						temp[k][j]=0;
					}
				}
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) {
				matrix[i][j]=temp[i][j];
			}
		}
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) {
				sysout matrix[i][j]
			}
		}
	}
}
