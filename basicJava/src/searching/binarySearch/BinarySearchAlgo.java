package searching.binarySearch;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] arr = { -1, 23, 46, 77, 89, 121, 234, 512, 1097 }; // sorted Array
		// Worst Case comparisions= N/2^k -- k=log(N) hence O(log(N)) complexity
		int target = 46;
		int index = binarySearch(arr, target);
		System.out.println(index);
	}

	static int binarySearch(int[] arr, int target) {

		int end = arr.length - 1;
		int start = 0;
		while (start <= end) {

//			int mid = (start + end) / 2; //start+end might exceed the int capacity so we use different formula
			int mid = start + ((end-start)/2);
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;

			}
		}

		return -1; // if nothing found
	}

}
