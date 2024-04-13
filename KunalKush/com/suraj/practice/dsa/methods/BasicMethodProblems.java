package com.suraj.practice.dsa.methods;

import java.util.Scanner;

public class BasicMethodProblems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		isPrime(num);
		isArmStrongNumber(num);
		for(int i=100;i<100000;i++) {
			isArmStrongNumber(i);
		}

	}

	private static boolean isArmStrongNumber(int num) {

		int sum = 0;
		int orignal = num;
		while (num > 0) {
			int rem = num % 10;
			sum += Math.pow(rem, 3);
			num = num / 10;
		}

		if (sum == orignal) {
			System.out.println("num= "+orignal+" is ArmStrong Number");
			return true;
		} else {
			//System.out.println("num= "+num+" is Not a ArmStrong Number");
			return false;
		}
	}

	private static void isPrime(int num) {
		boolean isPrimeNum = true;
//		for (int i = 2; i < Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				isPrimeNum = false;
//				break;
//			}
//		}
		
		for (int i = 2; i*i < num; i++) {
			if (num % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		if (isPrimeNum)
			System.out.println("Given Number is prime");
		else
			System.out.println("Given Number is not prime");
	}

}
