package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import pojo.Employee;

public class MapJDK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interface for Hashtable is Map<K,V>
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Guravjj");
		Employee ayo = new Employee(3, "ayodhya", "Guravs");
		Employee sanjay = new Employee(4, "Sanjay", "Guravkkk");

		Map<String, Employee> employees = new HashMap<>();
		// if key is same it will update the existing value
		employees.put(suraj.getLastName(), suraj);
		employees.put(abhi.getLastName(), abhi);
		employees.put(ayo.getLastName(), ayo);
		employees.put(sanjay.getLastName(), sanjay);

//		Iterator<Employee> iter = employees.values().iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//			
//		}

//		employees.forEach((k,v) -> System.out.println("key "+k +" value= "+v)); //Java 8 method

		for (Map.Entry<String, Employee> part : employees.entrySet()) {
			System.out.println(part.getKey() + " " + part.getValue()); // another method
		}

		for (String s : employees.keySet()) {
			System.out.println(s);
		}

		for (Employee e : employees.values()) {
			System.out.println(e);
		}

		// containsKey and containsValue Method
		System.out.println(employees.containsKey("Gurav"));
		System.out.println(employees.containsValue(ayo));

		System.out.println(employees.putIfAbsent("Gurav", sanjay));

		for (Employee e : employees.values()) {
			System.out.println(e);
		}

		System.out.println(employees.get("Guravs"));

		// Removing Duplicates from Linked List
		List<Integer> li = new LinkedList<Integer>();

		li.add(1);
		li.add(1);
		li.add(3);
		li.add(2);
		li.add(2);
		li.add(2);

		Map<Integer, Integer> removDup = new HashMap<Integer, Integer>();

		li.forEach(i -> removDup.put(i, 1)); // adding all the values in Map if any Duplicates come it will still add as
												// same
		
		for (Map.Entry<Integer, Integer> entry : removDup.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			
		}

	}

}
