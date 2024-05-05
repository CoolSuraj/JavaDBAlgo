package com.suraj.practice.dsa.recursion;
/**
 * Flow Of code 
 * 
 * first Static block always
 * @author admin
 *
 */


public class Fibonachi {
	

	public static void main(String[] args) {
		int n = 5;
		//q=60;
		
	
		
		System.out.println("Pradhan");
		int fi = fibonachi(n);
		System.out.println(fi);
//		This can be done using traditional  loops as below
		long Last_num=0;
		long last__sec_num = 1;
		for(int c=2;c<n;c++) {
			System.out.printf(""+(Last_num + last__sec_num)+",");
			long temp = last__sec_num;
			last__sec_num = last__sec_num+Last_num;
			Last_num = temp;
			
		}
		System.out.println();
		double ans = fibonachiByFormula(n);
		System.out.println(ans);
		Fibonachi fib = new Fibonachi(); //due to this above two blocks are called 
	}

	private static double fibonachiByFormula(int n) {
		double OneRoot5 = 1.0/Math.sqrt(5);
		double ans = OneRoot5 * (Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n));
		return ans;
	}

	private static int  fibonachi(int n) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		//unfortunetly this is very inefficent 
		if(n==0 || n==1) {
			return n;
		}else {
			return fibonachi(n-1)+fibonachi(n-2);
		}
		
	}

	

}
