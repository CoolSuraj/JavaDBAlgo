package com.suraj.practice.dsa.recursion;

public class BinarySearchByRecursion {
	
	public static void main(String[] args) {
		
		int[] arr =  {1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269};
		int start =0 ;
		int end = arr.length -1;
		int target =89;
		
	int index = binarySearch(arr,start,end,target);	
	
	System.out.println(arr[index]);
		
	}

	private static int binarySearch(int[] arr, int start, int end, int target) {
		if(end < start) {
			return -1;
		}
			int mid = start+(end-start)/2 ; 
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(target > arr[mid]) {
							
				return binarySearch(arr, mid+1, end, target);
			}
			
			
			return binarySearch(arr, start, mid-1, target);
		
		
		
	}
	
	

}
