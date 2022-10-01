package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * Step 1 : number of lines means outer for loop in this case i=5 Step 2:
		 * Identify the type of column values and how much column values we are getting
		 * in each row here for Every row we have a column Step 3: Identify what to
		 * print
		 * 
		 * 
		 */
		// printPattern1(5);
		// printPattern2(5);
//		patternPrint3(5);
//		printPattern4(5);
		printPattern5(5);
	}

	private static void printPattern5(int n) {
//		4444444
//		4333334
//		4322234
//		4321234
//		4322234
//		4333334
//		4444444
		
		//not made this one perfect please do the patch
		for (int i = 1; i <= 2 * n - 1; i++) {

			int totalColsInRow = i; // we need to find the logic total number of columns in row
			if (i > n) {
				totalColsInRow = n - i % n;
			}
			for (int j = 1; j <= totalColsInRow; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	static void printPattern4(int n) {
//		 	1
//		   212
//		  32123
//		 4321234
//		543212345
//		 4321234
//		  32123
//		   212
//		    1

		for (int i = 1; i <= 2 * n - 1; i++) {
			int col = i > n ? n - (i % n) : i;
			// Spaces first to get printed
			for (int j = 1; j <= n - col; j++) {
				System.out.print(" ");
			}
//			 first half numbers to get printed first
			for (int j = col; j >= 1; j--) {
				System.out.print(j);
			}
//			 second half should get printed now
			for (int j = 2; j <= col; j++) {
				System.out.print(j);
			}
			// break line per row
			System.out.println();
		}
	}

	private static void patternPrint3(int n) {

		for (int i = 1; i <= 2 * n - 1; i++) {

			int totalColsInRow = i; // we need to find the logic total number of columns in row
			if (i > n) {
				totalColsInRow = n - i % n;
			}
			for (int j = 1; j <= totalColsInRow; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		 *
//		 **
//		 ***
//		 ****
//		 *****
//		 ****
//		 ***
//		 **
//		 *

	}

	static void printPattern1(int n) {
		for (int i = 1; i <= 5; i++) {
			// for every row we have that many number of columns
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// when row over we need new line
			System.out.println();
		}
//		 *
//		 **
//		 ***
//		 ****
//		 *****
	}

	static void printPattern2(int n) {
		for (int i = 1; i <= 5; i++) {
			// for every row we have that many number of columns
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			// when row over we need new line
			System.out.println();
		}
	}

//	*****
//	****
//	***
//	**
//	*

}
