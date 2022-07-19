package arrayArrayList;

import java.util.ArrayList;

public class arrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();/*Here we cannot pass primitive data Types but the wrapper classes*/
		
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.toString());
		
		//other example of declarations
		
		ArrayList list2 = new ArrayList();  //this we can write but is not a good practice
		
		list2.add("String");
		list2.add("String");
		
		System.out.println(list2.toString());
				
				
	}

}
