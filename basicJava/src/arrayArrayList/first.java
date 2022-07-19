package arrayArrayList;

import java.util.Arrays;

public class first {

	public static void main(String[] args) {
		int[] p; //defination : compile time -- stack
		p=new int[3]; // declare: dynamic : runtime ---heap memory
//		we can pass this array to function as well
		//by default all int array will have 0 value
		System.out.println(Arrays.toString(p));
		changeFirstElement(p);  //it will send copy of reference to the function
		System.out.println(Arrays.toString(p));
		
		String strs[] = new String[2];  //is kind of array of objects
		strs[0]="kunal";
	}

	 static void changeFirstElement(int[] p) {
		p[1]=6;
		
	}

}
