package arrayArrayList;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//2D array
		
		int[][] twod = new int[3][];//number of cols not necessary here
		
		int[][] threesq = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println(threesq[0][1]); 
		System.out.println(Arrays.toString(threesq[1]));
		
		//why no. of cols not necessary cause we can have variable size array see below
		int[][] varSizeArray = {
				{1,2},{3,4,5},{6,7,8,9}
		};
		System.out.println(Arrays.toString(varSizeArray[0]));
		
	}

}
