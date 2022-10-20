package prateek.nagar.ArraysArrayLists;

import java.util.ArrayList;
import java.util.Comparator;

public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4 };
		int highestMountainLength = findHighestMountainLength(arr);
		System.out.println(highestMountainLength);
		int[] arr2 = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		int findHighestMountainLength = findHighestMountainLength(arr2);
		System.out.println(findHighestMountainLength);
		System.out.println(HighestMountainLength(new int[]{0,1,0}));
	}

	public static int HighestMountainLength(int[] arr) {
		// identify peaks;
		int n = arr.length;

		int largest = 0;// this is the length of largest mountain for now

		for (int i = 1; i <=n - 2;) { // i++ is handeled below
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				// This is to find if a[i] is peak or not and then

				int cnt = 1;
				int j = i;

				// count backwords
				while (j >= 1 && arr[j] > arr[j - 1]) {
					cnt++;
					j--;
				}
				while (i <= n - 2 && arr[i] > arr[i + 1]) {
					i++; // as we are incrementating from here and it is ultimately performing as o(n)
							// not as n^2
					cnt++;
				}
				largest = Math.max(largest, cnt);
			} else {
				i++; // not a peak move ahead
			}
		}

		return largest;

	}

	public static int findHighestMountainLength(int[] arr) {
		// My Implemenatation not good as Expected
		int ans = 0;
		int[] low = new int[arr.length];
		int[] high = new int[arr.length];

		low[0] = 0; // first index is always low
		int lowc = 1, highc = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {
				low[lowc++] = i; // saving lowest index
			}
			if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
				high[highc++] = i; // saving peak index
			}
		}
		// now the Last Element will be something like peek or low that to find
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			// this is peek
			high[highc++] = arr.length - 1;
		} else if (arr[arr.length - 1] < arr[arr.length - 2]) {
			// this is low
			low[lowc++] = arr.length - 1;
		}
		if (high[0] == 0) {
			return 0; // if there is no peak we do not have a mountain
		}
		ArrayList<Integer> sol = new ArrayList<>(); // lengths
		for (int i = 0; i < lowc; i++) {
			sol.add(low[i + 1] - low[i] + 1);
		}
		sol.sort(Comparator.naturalOrder());
		if (sol.size() == 0) {
			return 0;
		} else
			return sol.get(lowc - 1);
	}

}
