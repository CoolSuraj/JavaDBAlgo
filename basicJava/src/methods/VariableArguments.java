package methods;

import java.util.Arrays;

public class VariableArguments {

	public static void main(String[] args) {
			fun(2,3,4,55,6,7,8);
			System.out.println(sumOfAnyInts(2,3,4,55,6,7,8));
			int[] arr = {2,3,4,55,6,7,8};
			System.out.println(sumOfAnyInts(arr)); //you can also pass the array
			sumOfAnyIntsWithMsg("Suraj", arr);
	}
	
	static void fun(int ...v) {
		//variable number of args
		System.out.println(Arrays.toString(v));
		System.out.println(v[2]);
	}
	static int sumOfAnyInts(int ...nums) {
		int sum=0;
		for (int i : nums) {
			sum+=i;
		}
	return sum;
	}
	
	static int sumOfAnyIntsWithMsg(String msg,int ...nums) {  /*//The variable argument type int of the method sumOfAnyIntsWithMsg must be the last parameter*/
		int sum=0;
		for (int i : nums) {
			sum+=i;
		}
		System.out.println("we can have multiple different params as well right "+msg);
	return sum;
	}
}
