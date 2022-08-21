package collection;

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
	}

}
