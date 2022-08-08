package sort.SelectionSort;

import java.util.Arrays;

public class selectionSortAlgo {

	public static void main(String[] args) {
		int[] arr = { 3, 77, 4, 67, 5, 1234, 543 };

		// sort
		selection(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selection(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int lastIndex = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, lastIndex);
			
			//whatever we find as max put it as a last element 
			swapElementsOfArray(arr, maxIndex, lastIndex);
			//we can do the opposite for min index selection sort can also work that way

		}

	}

	static int getMaxIndex(int[] arr, int start, int end) {
		//getting the array in between start to end and sending the index
		int maxIndex = start;
		for (int i = start; i <= end; i++) {
			if (arr[i] > arr[maxIndex]) {

				maxIndex = i;
			}
		}
		return maxIndex;
	}

	static void swapElementsOfArray(int[] arr, int first, int second) {
		// normal swap do not work due to call by Value
//		but in case of Array we can do this
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
