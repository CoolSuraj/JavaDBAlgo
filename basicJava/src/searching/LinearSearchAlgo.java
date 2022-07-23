package searching;

public class LinearSearchAlgo {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,1,5,19,17,22,13,67,43}; 
		int target = 77;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
		//to print element found
		if(ans!= -1) {
		System.out.println(nums[ans]);
		}
	}
	
	static int linearSearch(int[] arr , int target) {
		if(arr.length ==0) {
			return -1;   //as array do not have -1 index  -1 indicates that no index found
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		//if nothing retuned till now means no value is there so
		return -1;
	}

}
