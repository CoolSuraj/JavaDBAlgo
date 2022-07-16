package basicJava;

import java.util.Scanner;

public class CountDigitsInNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		long num = sc.nextLong();
		long holdtheNum=num;
		//we have to count the occurrence of digit in the number
		int digitToFind = sc.nextInt();
		int count=0;
		while(num/10 > 0) {
			int digit = (int) (num % 10);
			if(digit==digitToFind)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("we have "+digitToFind+ " "+count+" times in " +holdtheNum);
		sc.close();
	}

}
