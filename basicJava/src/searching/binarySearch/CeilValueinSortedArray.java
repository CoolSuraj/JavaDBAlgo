package searching.binarySearch;

public class CeilValueinSortedArray {
//ceil value means shortest value ahead of target also including target
//	floor value means greatest value less than target 
	// here we are calculating floor and ceil value in array
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 99, 101, 123 };

		int target = 100;
		
		System.out.println(findFloorValue(arr, target));
		System.out.println(findCeilValue(arr, target));
		
	}
	/*
	 * What happens is when it comes near and it do not find the number at the end it will violate start<=end
	 * when at last time it will do start = mid+1  it will actually gives ceil value possible
	 * Similarly for floor value it will go one value behind at the last time i.e end = mid-1
	 * 
	 * */
	static int findFloorValue(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	static int findCeilValue(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start; // when we find nothing the ceil value
	}

}
