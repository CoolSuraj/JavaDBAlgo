package leetCodeProblems;

public class NextGreaterChar {
//	https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
	public static void main(String[] args) {
		char[] ch = { 'c', 'f', 'j' };
		char target = 'c';
		char ans = nextGreatestLetter(ch, target);
		System.out.println(ans);
	}

	static char nextGreatestLetter(char[] letters, char target) {
		  int start=0;
	        int end = letters.length-1;
	        
	        while(start  <= end){
	            int mid = start+ (end-start)/2;
	            
	            if(target < letters[mid]){
	                end = mid - 1; 
	            }else{
	                start = mid + 1;
	            }
//	            it should be in above order only below will not give correct order
//	            if(target > letters[mid]) {
//	            	start  = mid + 1;
//	            }else {
//	            	end = mid - 1;
//	            }
	            
	        }
	        return letters[start % letters.length];
	}
}
