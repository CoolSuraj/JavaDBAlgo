package collection.BucketSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {
		int[] arr = { 54, 46, 83, 66, 95, 92, 43 };

		bucketSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bucketSort(int[] arr) {
		// Bucket Sort Function
		List<Integer>[] buckets = new List[10]; // we want to create array of ArrayList of Integers

		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Integer>(); // we can also use ArrayList
		}

		for (int i = 0; i < arr.length; i++) {
			List<Integer> bucket = buckets[hash(arr[i])];

			bucket.add(arr[i]); // even we get hashed value same it will add the value in that linked
								// List
		}

		for (List<Integer> bucket : buckets) {
			if (bucket != null)
				Collections.sort(bucket);
		}

		int j = 0;
		for (List<Integer> bucket : buckets) {
			if (bucket != null) {
				for (int value : bucket) {
					arr[j++] = value;
				}
			}
		}
	}

	private static int hash(int value) {
		return value / (int) 10 % 10;
	}

}
