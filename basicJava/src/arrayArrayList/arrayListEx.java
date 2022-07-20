package arrayArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();/*Here we cannot pass primitive data Types but the wrapper classes*/
		
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list.toString());
		System.out.println(list.contains(2));
		list.set(0, 5); //update the existing value
		System.out.println(list);	  //same as System.out.println(list.toString());	
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(3));  //will get value at index
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		//other example of declarations
		
		ArrayList list2 = new ArrayList();  //this we can write but is not a good practice
		
		list2.add("String");
		list2.add("String");
		
		System.out.println(list2.toString());
				
				
	}

}
