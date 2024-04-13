package com.suraj.practice.dsa.arrays;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
//		printPattern1(n) ;
//		printPattern2(n);
//		printPattern3(n);

//		printDiamond(n);
		printSquare(n);

	}

	private static void printSquare(int n) {
//		Row cha vishay 
		int total = 2 * n - 1;
		for (int row = 0; row < total; row++) {

			// Col cha Vishay
			for (int col = 0; col < total; col++) {

				int atEveryIndex = n - Math.min(row, Math.min(total - 1 - row, Math.min(total - col - 1, col)));
				System.out.print(atEveryIndex + " ");

			}
			System.out.println();

		}

	}

	private static void printDiamond(int n) {
		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row < n ? row : 2 * n - row;
			int noOfSpaces = n - totalColsInRow;
			for (int i = 0; i < noOfSpaces; i++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	private static void printPattern3(int n) {
		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row < n ? row : 2 * n - row;

			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	private static void printPattern2(int n) {
		// Outer Loop == Number of rows
		for (int i = 0; i < n; i++) {
			// for inner loop check find the number and position of charachters
			// find a formula
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void printPattern1(int n) {
		// Outer Loop == Number of rows
		for (int i = 0; i < n; i++) {
			// for inner loop check find the number and position of charachters
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
