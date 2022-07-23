package searching.binarySearch;

public class OrderAgonasticBinarySearch {

	public static void main(String[] args) {
		// as we don't get whether array is Descending sorted or ascending
		int[] arr1 = { -1, 23, 46, 77, 89, 121, 234, 512, 1097 }; // sorted Array
		int[] arr2 = { 333, 46, 22, 11, 9, 4, 1, -1, -666 };
		int[] arr3 = { 3, 3, 3, 3, 3, 3, 3, 3 };
		// Worst Case comparisions= N/2^k -- k=log(N) hence O(log(N)) complexity
		int target = 46;
		int index1 = binarySearch(arr1, target);
		int index2 = binarySearch(arr2, target);
		int index3 = binarySearch(arr3, 3);
		System.out.println(index1 + " " + index2 + " " + index3);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		if (arr[start] > arr[end]) {
			return DescendingOrderArrayBinarySearch(arr, target, start, end);
		} else if (arr[start] == arr[end]) {
			return target == arr[start] ? start : -1; // in a sorted array if start element equal to end that means no
														// other element is present
		} else {
			 return AscendingOrderArrayBinarySearch(arr, target, start, end);
		}
//		This is the shortcut given below above is just to separately show the things
		
	/*
		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {

			int mid = start + ((end - start) / 2);
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;

				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;

				}
			}
		}

		return -1;
*/
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
