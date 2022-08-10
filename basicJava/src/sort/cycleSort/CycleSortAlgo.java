package sort.cycleSort;

import java.util.Arrays;

//cyclic sort must be used for the range of 1 to n and it will try this O(n)
public class CycleSortAlgo {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 4 };

		// sort
		cycleSort(arr); //for this sort element must start from 0 or 1 in sorted array and they should be continous
		System.out.println(Arrays.toString(arr));

	}

	static void cycleSort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
