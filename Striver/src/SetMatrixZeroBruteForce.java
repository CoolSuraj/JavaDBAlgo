package com.suraj.striver.coding;

import java.util.Arrays;

/**
 * https://takeuforward.org/data-structure/set-matrix-zero/
 * 
 * @author admin Problem Statement: Given a matrix if an element in the matrix
 *         is 0 then you will have to set its entire column and row to 0 and
 *         then return the matrix. Example : Input:
 *         matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 
 *         Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
public class SetMatrixZero {
	public static void main(String[] args) {

		int[][] egMatrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		// rows
		for (int i = 0; i < egMatrix.length; i++) {

			// columns
			for (int j = 0; j < egMatrix[i].length; j++) {
				if (egMatrix[i][j] == 0) {
					makeAllrowsAndColumnsMinusOne(egMatrix, i, j);
				}
			}

		}
		for (int i = 0; i < egMatrix.length; i++) {
			System.out.println(Arrays.toString(egMatrix[i]));
			;
		}
		// rows
		for (int i = 0; i < egMatrix.length; i++) {

			// columns
			for (int j = 0; j < egMatrix[i].length; j++) {
				if (egMatrix[i][j] == -1) {
					egMatrix[i][j] = egMatrix[i][j] + 1;
				}
			}

		}
		for (int i = 0; i < egMatrix.length; i++) {
			System.out.println(Arrays.toString(egMatrix[i]));
			;
		}

	}

	private static void makeAllrowsAndColumnsMinusOne(int[][] egMatrix, int k, int l) {
		// row
		for (int i = 0; i < egMatrix[k].length; i++) {
			int rowVariable = egMatrix[k][i];
			if (rowVariable != 0) {
				egMatrix[k][i] = -1; // although we can also use Math.negate for now we will use this
			}
		}

		// column
		for (int i = 0; i < egMatrix.length; i++) {
			int colVar = egMatrix[i][l];
			if (colVar != 0) {
				egMatrix[i][l] = -1; // although we can use Math.negate as well we use this
			}
		}

	}

}
