package prateek.nagar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumTriplets {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
		int target = 18;
		// step 1 Sort the Array
		Arrays.sort(arr);

		List<List<Integer>> triplets = new LinkedList<>();
		for (int i = 0; i <= arr.length - 3; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			// Taking one element in i at a time and finding pair j,k such that
			// arr[i]+arr[j]+arr[k]==target if sum < target increase j else decrease K
			// Two pointer approach
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] == target) {
					triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
					j++;
					k--;

				} else if (target - arr[i] < arr[j] + arr[k]) {
					k--;
				} else {
					j++;
				}

			}
		}

		System.out.println(triplets);
	}

}
