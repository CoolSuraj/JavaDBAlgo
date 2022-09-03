package collection;

import java.util.PriorityQueue;
import java.util.Queue;

import pojo.Employee;

public class QueueMainUse {

	public static void main(String[] args) {
		ArrayQueue empq = new ArrayQueue(5);
		
		
		Employee suraj = new Employee(1, "Suraj", "Gurav");
		Employee abhi = new Employee(2, "Abhi", "Gurav");
		Employee ayo = new Employee(3, "ayodhya", "Gurav");
		Employee sanjay = new Employee(4, "Sanjay", "Gurav");
		
		empq.add(suraj);
		empq.add(sanjay);
		empq.add(ayo);
	//	empq.add(abhi);
		
		try {
			empq.printQueue();
			empq.remove();
			System.out.println();
			empq.printQueue();
			
			empq.add(suraj);
			empq.add(ayo);
			empq.remove();
			empq.add(ayo);
			empq.remove();
			empq.add(ayo);
			empq.remove();
			empq.add(ayo);
			empq.remove();
			empq.add(ayo);
			empq.remove();
			empq.add(ayo);
			
			empq.printQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Queue<Integer> queues = new PriorityQueue<Integer>();
		
	}

}
