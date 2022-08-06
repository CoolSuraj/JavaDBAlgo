package sort.bubbleSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//also called as exchange sort
public class BubbleSort {

	public static void main(String[] args) {
		// How we use Bubble sort

		int[] arr = { 3, 77, 4, 67, 5, 1234, 543 };

		// sort
		int[] sortedArray = bubbleSortedArray(arr);
		System.out.println(Arrays.toString(sortedArray));

		//Map<Integer, Integer> free = new HashMap<Integer, Integer>();

	}

	static int[] bubbleSortedArray(int[] arr) {
		/*
		 * with every pass the largest element should come at last and then we ignore
		 * last index
		 */

		for (int i = 0; i < arr.length; i++) {
			// every time we will ignore the last element
			// the i should loop till length-1
			 boolean isAlreadySorted = true;
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j-1] > arr[j]) {
					// if the element is greater than previous element then swap there positons
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					isAlreadySorted= false;
				}

			}
			
			if(isAlreadySorted) {
				break;
			}

		}

		return arr;
	}

}
