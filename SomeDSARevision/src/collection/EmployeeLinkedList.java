package collection;

import pojo.Employee;
import pojo.EmployeeNode;

public class EmployeeLinkedList {
	private EmployeeNode head;  //this is null by default even if you not mention it
//	This is singlyLinked List
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	
	public EmployeeNode RemoveFrontNode() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		return removedNode;
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
