package prateek.nagar.ArraysArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestBand {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6 };
		int findLongestConsecutiveNumbers = findLongestConsecutiveNumbers(arr);
		System.out.println(findLongestConsecutiveNumbers);
	}

	private static int findLongestConsecutiveNumbers(int[] arr) {
		//Arrays.sort(arr);
		//we will look each and every element for that we can use Unordered set which is o(1) approach
		Set<Integer> data = new HashSet<Integer>();
		if(arr.length == 0) {
			return 0;  //if array do not have any element
		}
		for(int i:arr) {
			data.add(i);
		}
		//iterate over array
		int LargestLength=1;
		int count=0;
		Map<Integer,ArrayList<Integer>> p = new HashMap<>();//this map implemetation is just for if someone needed all bands then how to show no use for this soln
		for(int i : arr) {
			int parent = i-1;//try to get first element of the series is what assumed
			if(!data.contains(parent)) {
				ArrayList<Integer> li = new ArrayList<Integer>(); 
				li.add(i);
				int next_no = i+1;
				int cnt=1;
				
				while(data.contains(next_no)) {
					li.add(next_no);
					next_no++;
					cnt++;
				}
				p.put(count++, li);
				LargestLength = Math.max(LargestLength, cnt);
			}
		}
		return LargestLength;
		
		

	}

}
