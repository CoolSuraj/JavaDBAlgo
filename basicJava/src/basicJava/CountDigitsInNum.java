package basicJava;

import java.util.Scanner;

public class CountDigitsInNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		long num = sc.nextLong();
		long holdtheNum=num;
		long reverseNumber=0;
		//we have to count the occurrence of digit in the number
		int digitToFind = sc.nextInt();
		int count=0;
		while(num > 0) {
			long digit = (num % 10);
			reverseNumber = reverseNumber*10+digit;
			if(digit==digitToFind)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("we have "+digitToFind+ " "+count+" times in " +holdtheNum);
		System.out.println("The Reverse of given number is "+reverseNumber);
		sc.close();
	}

}
