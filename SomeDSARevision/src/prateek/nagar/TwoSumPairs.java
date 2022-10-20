package prateek.nagar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumPairs {
	public static int twoSum(int[] arr, int target) {
		Set<Integer> trash = new HashSet<Integer>();
		int n = arr.length;
		int k = target;
		int[] ans = new int[2 * n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int requiredNum = k - arr[i];
			if (trash.contains(requiredNum)) {
				ans[count++] = arr[i];
				ans[count++] = requiredNum;
			}
			trash.add(arr[i]);

		}

		return count / 2;

	}

	public static int twoSumByMap(int[] arr, int target) {
		Map<Integer, Integer> ts = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer count = ts.get(arr[i]);
			ts.put(arr[i], count == null ? 1 : count + 1);

		}
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			Integer count = ts.get(arr[i]);
			ts.put(arr[i], count == null ? 0 : count - 1);

			if (ts.get(target - arr[i]) != null)
				ans += ts.get(target - arr[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] p = { 1, 5, 5, 5, 5, 7 };
		System.out.println(twoSum(p, 10));
		System.out.println(twoSumByMap(p, 10)); //this also captures repeating number
	}
}
