package leetCodeProblems.binarySearch;
//https://leetcode.com/problems/find-in-mountain-array/submissions/

interface MountainArray {
    public int get(int index);
  public int length();
}

public class FindingElementInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	
	
	public int findInMountainArray(int target, MountainArray mountainArr) {
        	int start=0;
		int end = mountainArr.length() -1;
        int peak;
		int ans=-1;
		while(start < end) {
			int mid = start+ (end-start)/2;
			if(mountainArr.get(mid) > mountainArr.get(mid+1) ){
			    // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
				end = mid;
			}else {
				// you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
			}
			
			
		}
		peak = start;	
		//start == peak 
        //you can also use order Agnostic Binary Search directly but I given this school of thought  // now
        
        start=0;
        end = peak;
        while (start <= end) {

//			int mid = (start + end) / 2; //start+end might exceed the int capacity so we use different formula
			int mid = start + ((end-start)/2);
			if (mountainArr.get(mid) == target) {
				return mid;
			}
			if (target  < mountainArr.get(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		} 
        
        
        start = peak+1;
        end =mountainArr.length() -1; ;
        while (start <= end) {

//			int mid = (start + end) / 2; //start+end might exceed the int capacity so we use different formula
			int mid = start + ((end-start)/2);
			if (mountainArr.get(mid) == target) {
				return mid;
			}
			if (target >  mountainArr.get(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		} 
        
        
		return -1;
    }
}
