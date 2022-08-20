import java.util.ArrayList;
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

	}

}
