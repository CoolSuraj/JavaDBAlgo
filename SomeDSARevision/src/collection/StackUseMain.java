package collection;

import java.util.Stack;

import pojo.Employee;

public class StackUseMain {

	public static void main(String[] args) {
		ArrayStack empstack = new ArrayStack(10);
		
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Gurav");
		Employee sanjay = new Employee(4, "Sanjay", "Gurav");
		
		empstack.push(suraj);
		empstack.push(abhi);
		empstack.push(ayo);
		empstack.push(sanjay);
		
		System.out.println(empstack.peek());
		
		empstack.pop();
		empstack.pop();
//		
		
		System.out.println(empstack.peek());
		
		LinkedListStack lls = new LinkedListStack();
		lls.push(suraj);
		lls.push(abhi);
		lls.push(ayo);
		lls.push(sanjay);
		
	System.out.println(lls.peek());
		
		lls.pop();
		lls.pop();
//		
		
		System.out.println(lls.peek());
		
		//Java.util.Stack
		
		Stack<Employee> st = new Stack<Employee>();
		st.push(suraj);
		st.push(sanjay);
		System.out.println("before poping "+st.peek());
		st.pop();
		System.out.println("after poping "+st.peek());
		
		
		//Doc Says good implementation is provided by Deque interface impls
//		Deque<Employee> stackA = new ArrayDeque<Employee>() ;
	}

}
