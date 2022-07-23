package searching.binarySearch;

public class OrderAgonasticBinarySearch {

	public static void main(String[] args) {
		// as we don't get whether array is Descending sorted or ascending
		int[] arr1 = { -1, 23, 46, 77, 89, 121, 234, 512, 1097 }; // sorted Array
		int[] arr2 = { 333, 46, 22, 11, 9, 4, 1, -1, -666 };
		// Worst Case comparisions= N/2^k -- k=log(N) hence O(log(N)) complexity
		int target = 46;
		int index1 = binarySearch(arr1, target);
		int index2 = binarySearch(arr2, target);
		System.out.println(index1 + " " + index2);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		if (arr[start] > arr[end]) {
			return DescendingOrderArrayBinarySearch(arr, target, start, end);
		} else {
			return AscendingOrderArrayBinarySearch(arr, target, start, end);
		}

	}

	static int AscendingOrderArrayBinarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {

//				int mid = (start + end) / 2; //start+end might exceed the int capacity so we use different formula
			int mid = start + ((end - start) / 2);
			if (arr[mid] == target) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		}

		return -1;
	}

	static int DescendingOrderArrayBinarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {

//			int mid = (start + end) / 2; //start+end might exceed the int capacity so we use different formula
			int mid = start + ((end - start) / 2);
			if (arr[mid] == target) {
				return mid;
			}
			if (target > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		}

		return -1;
	}

}
