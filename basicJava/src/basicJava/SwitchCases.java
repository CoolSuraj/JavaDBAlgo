package basicJava;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Switch case have new format
		String fruit = sc.nextLine();
		
		/*//Default switch implementation
		switch (fruit) {
		case "Mango": 
			System.out.println("Mango");
			break;
			
		case "Guava": 
			System.out.println("Guava");
			break;
			
		default:
			System.out.println("kai fruit!! nit liha");
		}
		*/
		switch (fruit) {//new style to write switch in java
		case "Mango" ->	System.out.println("Mango");
		case "Guava" ->System.out.println("Guava");
		default ->System.out.println("kai fruit!! nit liha in new Style");
		}
		
		
		//also
		int day = sc.nextInt();
		/*switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.print("Weekend");
			break;
		default:
			System.out.println("7 chya var vaar tuzya BAA ne pahile ka ?? ");
		}

	*/
		switch (day) {
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7 -> System.out.print("weekend");
		default ->System.out.println("7 chya var vaar tuzya BAA ne pahile ka ?? ");
		}
		sc.close();
	} 

}
