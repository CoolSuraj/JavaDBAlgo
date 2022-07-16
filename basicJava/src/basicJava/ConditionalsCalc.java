package basicJava;

import java.util.Scanner;

public class ConditionalsCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		sc.close();
//		Program to find max number method 1
//		int max=a;
//		
//		if(b>max)
//			max=b;
//		else
//			max=c;
		
//		Program to find max number method 2
		int max = Math.max(a, Math.max(b, c));  //method provided in Math
		
//		Program to find max number method 3
//		int max=0;
//		
//		if(a>b)
//			max=a;
//		else
//			max=b;
//		
//		if(c>max)
//			max=c;
		
		System.out.println(max);
		
		
	}
}
