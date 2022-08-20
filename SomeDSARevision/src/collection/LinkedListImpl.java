package collection;

import java.util.LinkedList;
import java.util.List;

import pojo.Employee;

public class LinkedListImpl {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(3);
		
		
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Gurav");
		Employee sanjay = new Employee(4, "Sanjay", "Gurav");

		List<Employee> empll = new LinkedList<Employee>();
		empll.add(new Employee(1, "Suraj", "Gurav"));
		empll.add(new Employee(2, "Abhi", "Gurav"));
		empll.add(new Employee(3, "ayodhya", "Gurav"));
		empll.add(new Employee(4, "Sanjay", "Gurav"));
		
		EmployeeLinkedList el  = new EmployeeLinkedList();
		el.addToFront(suraj);
		el.addToFront(abhi);
		el.addToFront(ayo);
		el.addToFront(sanjay);
		
		el.printList();

	}

}

