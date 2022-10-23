package prateek.nagar.ArraysArrayLists;

public class RainProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("Water saturated " + RainWaterSaturated(arr));
	}

	private static int RainWaterSaturated(int[] arr) {
		int n = arr.length;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] sol = new int[n];
		if (n <= 2)
			return 0;
		left[0] = arr[0];
		right[n - 1] = arr[n - 1];
		
		//Now we will add highest value till i from  left and right in respective arrays
		for (int i = 1; i < n - 1; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
			right[n - i - 1] = Math.max(arr[n - i - 1], right[n - i]);
		}
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sol[i] = Math.min(left[i], right[i]) - arr[i]; // it will have capacity at each column
			sum += sol[i];
		}

		return sum;
	}

}
