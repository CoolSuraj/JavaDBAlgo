package collection;

import java.util.Iterator;
import java.util.LinkedList;

import pojo.Employee;

public class DoublyLinkedListImpl {

	public static void main(String[] args) {
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Gurav");
		Employee sanjay = new Employee(4, "Sanjay", "Gurav");
		
		//JDK gives you Doubly Linked List
		LinkedList<Employee> employees  = new LinkedList();
		employees.add(suraj);
		employees.addFirst(abhi);
		employees.addLast(ayo);
		employees.add(2, sanjay);
		
		Iterator iter = employees.iterator();
		
		System.out.print("Head -> ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+" -> ");
		}
		System.out.print("null");
		
		

	}

}
