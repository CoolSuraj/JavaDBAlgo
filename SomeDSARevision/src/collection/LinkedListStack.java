package collection;

import pojo.Employee;

public class LinkedListStack {
	//Implementation of Stack using Singly Linked List
	
	EmployeeLinkedList el;
	
	public LinkedListStack() {
		 el  = new EmployeeLinkedList();
	}
	
	public void push(Employee employee) {
		el.addToFront(employee);
	}
	
	public void pop() {
		el.RemoveFrontNode();
	}
	
	public Employee peek() {
		return el.headEmployee();
	}
}
