package collection;

import java.util.LinkedList;
import java.util.List;

import pojo.Employee;

public class LinkedListImpl {

	public static void main(String[] args) {
	//This is singlyLinked List
		
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Gurav");
		Employee sanjay = new Employee(4, "Sanjay", "Gurav");

		
		
		EmployeeLinkedList el  = new EmployeeLinkedList();  //this is what we created
		el.addToFront(suraj);
		el.addToFront(abhi);
		el.addToFront(ayo);
		el.addToFront(sanjay);
		
		el.printList();
		System.out.println("\n Removed Node: ");
		System.out.println(el.RemoveFrontNode());

	}

}

