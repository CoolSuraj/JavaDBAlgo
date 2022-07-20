package arrayArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class multiArrList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> multial = new ArrayList<>(); //creates 2D ArrayList  //used many times in compettive codinh
		//Now as we create multi Dimensional ArrayList we need to initialize at least some of it like below
		
		for(int i=0;i<3;i++) {
			multial.add(new ArrayList<Integer>()); //by initializing we are saying that we have some 0 data here
		}
		
		//Ex to show how to input
		Scanner sc =new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				multial.get(i).add(sc.nextInt());
			}
		}
		System.out.println(multial);
	}

}
