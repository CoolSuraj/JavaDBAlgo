package leetCodeProblems;

public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		int maxWealth = 0;
		for (int[] arr : accounts) {
			int sum = 0;
			for (int num : arr) {
				sum += num;
			}
			if (sum > maxWealth) {
				maxWealth = sum;
			}
			//Math.max(sum,maxWealth);
			System.out.println();
		}
		return maxWealth;

	}
}
