package searching;

public class SearchInTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,32,4,6},
				{3,33,34,67},
				{2,6}
		};
		int target = 33;
		System.out.println("The element is present in given array : "+searchElementInTwoDArray(arr,target));
		
	}

	 static boolean searchElementInTwoDArray(int[][] arr, int target) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return true;
				}
			}
		}
		return false;
	}

}
