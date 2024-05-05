package com.suraj.practice.dsa.maths;

public class Maths1 {
	public static void main(String[] args) {

		int a = 10;

		int b = a << 1;// left shift what actually happens is b=10 * Math.pow(2,1);

		System.out.println(b);

		// int c= a<<6;
//		System.out.println(c);//640
		
		
		 a = 100;

		b = a >> 1;// right shift what actually happens is b=10 * Math.pow(2,-1);

		System.out.println(b);
		
		
		//Method have explanation
		boolean isOdd = isEvenOdd(101);
		System.out.println(isOdd);
	}

	private static boolean isEvenOdd(int i) {
		/*
		 * for any binary number the rightmost number is called as LSB
		 * Least significant bit
		 * 
		 * if LSB ==0 --> Even Number else ODD Number
		 * 
		 * 10-> 1010  <-- ending with 0 hence even 
		 * 11-> 1011 <-- endning with 1 hence odd
		 * 
		 * 
		 * 1010 & 1 this operation will give us what is LSB
		 * 
		 *  1010                 
		 * &0001
		 * ------
		 *  0000
		 *  
		 *  
		 *  1011
		 * &0001
		 * ------
		 *  0001
		 
		 */
		return (i & 1)==1;
//		return false;
	}

}
