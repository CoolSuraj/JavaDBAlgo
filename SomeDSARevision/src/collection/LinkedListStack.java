package collection;

import java.util.LinkedList;

import pojo.Employee;

public class LinkedListStack {
	// Implementation of Stack using Singly Linked List

	EmployeeLinkedList el;

	public LinkedListStack() {
		el = new EmployeeLinkedList();
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

class LinkedStack {
	// Implementation of Stack using Linked List

	private LinkedList<Employee> stack;

	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}

	public void push(Employee employee) {
		stack.push(employee); // this is already given by Linked List implementation we just need to make this
								// class such that people should not use other menthod
	}

	public void pop() {
		stack.pop();
	}

	public Employee peek() {
		return stack.pop();
	}
}
