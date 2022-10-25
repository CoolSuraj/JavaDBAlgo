package collection;

import pojo.Employee;

public class HashTableImplMain {
	//we can also have chaining Implementation of Array of Linked List which is easier than this one 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Guravs");
		Employee sanjay = new Employee(4, "Sanjay", "Guravkkk");
		
		SimpleHashTable sht = new SimpleHashTable(); //from our implementation
		
		sht.put(suraj.getLastName(), suraj);
		sht.put(sanjay.getLastName(), sanjay);
		sht.put(ayo.getLastName(), ayo);
		sht.put(abhi.getLastName(), abhi);
		
		sht.printHashTable();
		System.out.println();
		System.out.println("removed Element "+sht.remove("Guravs"));
		System.out.println();
		sht.printHashTable();
		
		System.out.println(sht.get("Gurav"));
	}

}
