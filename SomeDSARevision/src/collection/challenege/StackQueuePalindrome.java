package collection.challenege;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I did, did I?";
		String str2= "Racecar";
		String str3 ="hello";
		
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
		System.out.println(isPalindrome(str3));
		

	}

	 static boolean isPalindrome(String str) {
		 boolean ans= true;
		 String trial = str.toLowerCase();
		 char[] chars = trial.toCharArray();
		 Stack<Character> chStack = new Stack<>();
		 Queue<Character> chQueue = new LinkedList<>();
		 for(char ch : chars) {
			 if(ch<='z' && ch>='a') {
				 chStack.push(ch);
				 chQueue.offer(ch);
			 }
			 
		 }
		 
		 while(!chStack.isEmpty()) {
			 
			 if(chQueue.poll() != chStack.pop()) {
				 ans=false;
				 break;
			 }
		 }
		 
		 
		 
		 
		 return ans;
	}

}
