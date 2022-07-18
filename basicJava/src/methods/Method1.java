package methods;

import java.util.ArrayList;


public class Method1 extends Object{

	public static void main(String[] args) {
//		int p = Math.addExact(-1, 2);  //inbuilt method
//		System.out.println(p);
//		

		
		
		String A = "RRGGRRGGGGRR";  //find GGRR or RRGG how many times /*This Question asked in Codenation 2022 July*/
		int count=0;
		for(int i = 0;i<A.length()-3;i++) {
			if(A.charAt(i)!=A.charAt(i+1)) {
				continue;
			}
			ArrayList<String> temp = new ArrayList<>();
			
				temp.add(A.substring(i,i+2));
				temp.add(A.substring(i+2,i+4));
				//System.out.println(temp.get(0));
				count=count+patternCounter(temp);
			
		}
		System.out.println(count);
		
		
		
		
	}
	
	
	
	static int patternCounter(ArrayList<String> temp) {
		int count=0;
		if(temp.get(0).equals("RR")) {
			if(temp.get(1).equals("GG")) {
				count++;
			}
		}else if(temp.get(0).equals("GG")) {
			if(temp.get(1).equals("RR")) {
				count++;
			}
		}
		return count;
	}
	
	
}
