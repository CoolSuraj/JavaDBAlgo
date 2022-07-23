package leetCodeProblems;

public class FindNumbersDigitsEvenNos {

	/*
	 * public static void main(String[] args) { int[] nums = {2,34,45,4567,345,234};
	 * FindNumbersDigitsEvenNos f = new FindNumbersDigitsEvenNos();
	 * System.out.println(f.findNumbers(nums)); }
	 */

	public int findNumbers(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (findNumbersDigitsEven(nums[i])) {
				count++;
			}
			// String intToString = Integer.toString(nums[i]); //not optimized much
			// if(intToString.length() % 2 ==0 ){
			// count++;
			// }
		}

		return count;
	}

	public boolean findNumbersDigitsEven(int num) {
		if (num < 0) {
			num *= -1;
		}
		int count = (int) Math.log10(num) + 1; // optimal and the most shortcut way to find number of digits in Number
		// System.out.println(count);
//		while (num > 0) {
//			count++;
//			num /= 10;
//		}
		return count % 2 == 0;
	}
}
