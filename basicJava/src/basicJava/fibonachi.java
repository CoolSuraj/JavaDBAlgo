package basicJava;

import java.util.Scanner;

public class fibonachi {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number for printing fibonachi series");
		long  num = sc.nextInt();
		long  a=0; //first number in fibo series
		long b=1; //second number in fibo series
		long count=2;
		System.out.print(a+" "+b);
		while(count<=num) {
			long temp = b; //temp will hold next value
			b=b+a;  //adding with previous value
			a=temp; //now as b got new value the a should have last value
			System.out.print(" "+b);
			count++;
		}
		
		sc.close();
	}

}
