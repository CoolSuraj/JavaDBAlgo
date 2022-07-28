package leetCodeProblems.binarySearch;

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayMaxSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int splitArray(int[] nums, int m) {
		int start = 0;
		int end = 0; /// nums is unsorted

		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // after this loop start will contain maximum value of an array
			end += nums[i];  //and End will have entire array Element sum
		}
//		Now start have minimum possible answer and end will have maximum possible answer
		while(start<end){
			
			//try middle element as potential answer
            int mid = start + (end-start)/2;
            
            //calculate pieces in which we can divide which will be less than mid
            int sum = 0 ; 
            int pieces = 1; //at least array will have one full piece
            for(int num:nums) {
            	if(sum + num > mid) {
            		sum = num;
            		pieces++;
            	}else {
            		sum+=num;
            	}
            }
            if(pieces > m) {
            	//m is the number of pieces allowed
            	start = mid+1;
            }else {
            	end = mid;
            }
            if(start==end) {
            	return end;
            }
        }
		
		
		return end;
	}
	
	int binarySearch(int[]arr , int k ){
        int start =0 ;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                start = mid+1;
            }
            if(arr[mid]>k){
                end = mid-1;
            }
        }
        return -1;
    }

}
