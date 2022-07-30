package searching.binarySearch.twoDArray;

import java.util.Arrays;

public class TwoDSortedArraySearchBinary {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3,4},
				{11,22,33,44},
				{111,222,333,444}
		};
		int target = 33;
		int ans[] =  binarySearchin2D(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] binarySearchin2D(int[][] matrix,int target ) {
		int ans[] = {-1,-1};
		int row=0;
		int column = matrix.length -1;
		
		while(row<column+1 && column >=0) {
			
			if(matrix[row][column] == target) {
				ans[0] = row;
				ans[1] =column;
				break;
				
			}else if(matrix[row][column] < target) {
				row++;
			}else {
				column--;
			}
			
		}
		
		return ans;
	}

}
