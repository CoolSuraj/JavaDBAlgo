package searching;

public class MinMaxElementOfArray {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 43, 567, 7, 8, 9 };

		System.out.println("Min element of arr " + minNumOfArray(arr));
		System.out.println("Max element of arr " + maxNumOfArray(arr));

	}

	static int minNumOfArray(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}

		int min = arr[0]; // logic for min
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) { // logic for min
				min = arr[i];
			}
		}
		return min;
	}

	static int maxNumOfArray(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int max = arr[0]; // logic for max
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // logic for max
				max = arr[i];
			}
		}
		return max;
	}
}
