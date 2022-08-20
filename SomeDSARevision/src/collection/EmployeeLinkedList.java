package collection;

import pojo.Employee;
import pojo.EmployeeNode;

public class EmployeeLinkedList {
	private EmployeeNode head;  //this is null by default even if you not mention it
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
	}
	
	public void printList() {
		EmployeeNode current = head;
		while(current!=null) {
			System.out.print(current.getEmployee()+" -> ");
			current = current.getNext();
			
		}
		System.out.print("null");
	}
}
