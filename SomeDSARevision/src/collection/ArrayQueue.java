package collection;

import pojo.Employee;

//this is array implementation of Queue

public class ArrayQueue {
	private int front;
	private int back;

	// Last In First out
	private Employee[] queue;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	// front will show the location of element in front
//	whereas back will show location of element at last + 1; i.e next availibile position

	public void add(Employee employee) {
		if ( size() == queue.length-1) {
			Employee[] newArray = new Employee[2 * queue.length];
			int numItems = size();
			System.arraycopy(queue, front, newArray, 0, queue.length - front); // this is circular Queue implementation
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			queue = newArray;
			front = 0;
			back = numItems;
		}

		queue[back] = employee;
		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0; // this is circular Queue implementation
		}

	}

	public boolean isEmpty() {
		if (front <= back)
			return back - front == 0;

		else {
			return back - front + queue.length == 0;
		}
	}
	
	public int size() {
		if (front <= back)
			return back - front ;

		else {
			return back - front + queue.length ;
		}
	}

	public void remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
			// return;
		}
		int newPos = front + 1;
		queue[front] = null;
		front = newPos;

		if (isEmpty()) {
			front = 0;
			back = 0;
		}
		if (front == queue.length) { // this is circular Queue implementation
			front = 0;
		}
	}

	public Employee peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
			// return;
		}
		return queue[front];
	}

	public void printQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
			// return;
		}
		if (front <= back) {
			for (int i = front; i < back; i++) {
				System.out.print(queue[i] + " -> ");
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}

	}

}
