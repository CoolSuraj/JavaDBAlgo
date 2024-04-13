package com.suraj.practice.dsa.arrays;

public class Array1 {
	
	public static void main(String[] args) {
		//syntax of Array 
		int[] arr = new int[10];
		int[] arr2 = {1,2,3,4,5,6,7}; //Direct 
		
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		System.out.println(isPalindrome("abcdscba"));
		
	}

	private static boolean isPalindrome(String string) {
		boolean isPalindrome = true;
		string = string.toLowerCase();
		
		for(int start=0,end=string.length()-1 ; start<string.length() && end>=0 && start<=end;start++,end--) {
			if(string.charAt(start) == string.charAt(end)) {
				continue;
			}else {
				isPalindrome=false;
				break;
			}
		}
		
		return isPalindrome;
		
	}

}
