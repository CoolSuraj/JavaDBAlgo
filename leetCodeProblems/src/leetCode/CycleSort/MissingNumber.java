package leetCode.CycleSort;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4,0,1,2};  //3 is missing which needs to get it out
		
		CyclicSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	 static void CyclicSort(int[] arr) {
		for (int i = 0; i < arr.length; ) {
			int correctIndexOfElement = arr[i];
			if(arr[correctIndexOfElement]!=arr[i]) {
				int temp = arr[correctIndexOfElement];
				arr[correctIndexOfElement] = arr[i];
				arr[i]=temp;
			}else {
				i++;
			}
		}
		
	}

}
