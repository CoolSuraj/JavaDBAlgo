package leetCodeProblems;

public class FindNumbersDigitsEvenNos {

	public int findNumbers(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (findNumbersDigitsEven(nums[i])) {
				count++;
			}
			// String intToString = Integer.toString(nums[i]);  //not optimized much
			// if(intToString.length() % 2 ==0 ){
			// count++;
			// }
		}

		return count;
	}

	public boolean findNumbersDigitsEven(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count % 2 == 0;
	}
}
