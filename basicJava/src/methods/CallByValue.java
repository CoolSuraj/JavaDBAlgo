package methods;

import java.util.Arrays;

public class CallByValue {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		changeFirstValue(arr);
		System.out.println(Arrays.toString(arr));
	}

	 static void changeFirstValue(int[] nums) {
		nums[0]=99;
		//this will actually change arr in main
		//This happens because we pass the reference which is pointing to same array and 
		//any reference which changes the value will change the orignal value as well
		
	}

}
