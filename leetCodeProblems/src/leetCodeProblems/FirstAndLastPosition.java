package leetCodeProblems;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] sol = {2,2};
		int target =2;
		int[] ans = searchRange(sol,target);
		System.out.println(Arrays.toString(ans));
		
	}
	public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
        
    }
    
    public  static int search(int[] nums, int target, boolean isFirstOccurenceWanted){
        int start =0 ;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2 ; 
            
            if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
            if(target == nums[mid]){
                ans = mid; //Potential answer
                if(isFirstOccurenceWanted){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
