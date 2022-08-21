package collection;

import pojo.Employee;

public class ArrayStack {

	private Employee[] stack;
	private int top; //top means next available space so elemnt is always at top-1;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee employee) {
		if (top == stack.length) {
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}

		stack[top++] = employee;
	}

	public void pop() {
		if (top == 0) {
			System.out.println("cannot pop out of empty stack");
		} else {
			stack[--top] = null; // --top actually make top = top-1 but if we use stack[top-1] then top value
									// remain same

		}
	}

	public Employee peek() {
		if(top==0) {
			return null;
		}
		return stack[top - 1];
	}

}
