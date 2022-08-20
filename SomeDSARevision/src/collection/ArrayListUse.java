package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListUse {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		// we can create any class like Employee
//		and List<Employee> empList = new ArrayList<>(); do it like this
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		System.out.println("The Second Element of ArrayList " + al.get(1));

		System.out.println(al.isEmpty()); // if the arraylist empty it is true

		al.set(3, 400); // replace Exisiting Element

		System.out.println(al.size()); // whatever number of element present

		al.add(1, 200); // adding to the specific index, it will shift other elemnts one step ahaead

		System.out.println(al.contains(200)); // if the arrayList was of type Employee we had to override Equals and
												// hashcode method in employee class

		System.out.println(al.indexOf(200));

		// now remove 400
		al.remove(4); // 4 is index

		System.out.println("final values: ");
		al.forEach(num -> System.out.println(num)); // used Lambda Expression here

//		 Integer[] numArray = al.toArray(new Integer[al.size()]);
//		
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}

//		for(int i =0 ; i<al.size() ; i++) {
//			System.out.println(al.get(i));
//		}

//		for(int i: al) {
//			System.out.println(i);
//		}

//		Iterator<Integer> iter = al.iterator();

//		for(;iter.hasNext();) {
//			System.out.println(iter.next());
//		}
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		Integer[] arr = { 3, 1, 4, 5, 2 };

		List<Integer> unsorted = Arrays.asList(arr);
		System.out.println("before sort ");
		unsorted.forEach(num -> System.out.print(num + " "));
		System.out.println("\nafter sort ");
		bubbleSort(unsorted);
		unsorted.forEach(num -> System.out.print(num + " "));

	}

	// 3 1 4 5 2
	static void bubbleSort(List<Integer> al) {

		for (int i = 0; i < al.size(); i++) {

			for (int j = 1; j < al.size() - i; j++) {
				if (al.get(j) < al.get(j - 1)) {

					// swap that ones
					int temp = al.get(j - 1);
					al.set(j - 1, al.get(j));
					al.set(j, temp);

				}

			}

		}

	}

}
