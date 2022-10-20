package prateek.nagar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;	

public class ArrayListProblems {

	public static void main(String[] args) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			//List<Integer> arr2;
			ArrayList<ArrayList<Integer>> arr2d = new ArrayList<>();
			arr.add(0);
			arr.add(10);
			arr.add(100);
//			arr.remove(arr.size()-1);
			
			ArrayList<Integer> copy = (ArrayList<Integer>) arr.clone();
			System.out.println(copy);
			arr2d.add(new ArrayList<Integer>());
			arr2d.get(0).add(3);
			arr2d.get(0).add(5);
			arr2d.get(0).add(7);
			
			arr2d.add(new ArrayList<Integer>());
			arr2d.get(1).add(2);
			arr2d.get(1).add(4);
			arr2d.get(1).add(6);
			arr2d.get(1).add(8);
			arr2d.add(arr);
			
			arr2d.get(0).set(1, 333);
			System.out.println(arr2d);
			
			//Pairs:  Two Sum Problem
			int sum=7;
			ArrayList<Integer> pairs= new ArrayList<>();
			//aList.addAll(Arrays.asList(question2));			
//			for(int i=0;i<5;i++)
//			pairs.add(i);
			
			pairs.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
			
			Set<Integer> trash = new HashSet<Integer>();
			int[] ans = new int[10];
			int count=0;
			for(int i=0;i<5;i++) {
				int requiredNum = sum - pairs.get(i);
				if(trash.contains(requiredNum)) {
					ans[++count]=pairs.get(i);
					ans[++count]=requiredNum;
				}else {
					trash.add(pairs.get(i));
				}
			}
			
			System.out.println(Arrays.toString(ans));
			
			
			
			
	
			

	}
}
