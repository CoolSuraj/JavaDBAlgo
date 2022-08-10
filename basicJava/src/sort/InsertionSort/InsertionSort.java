package sort.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 77, 4, 67, 5, 1234, 543 };

		// sort
		inserion(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void inserion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					swapElementsOfArray(arr, j, j-1);
				}else {
					break;
				}
			}
		}

	}
	
	static void swapElementsOfArray(int[] arr, int first, int second) {
		// normal swap do not work due to call by Value
//		but in case of Array we can do this
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
