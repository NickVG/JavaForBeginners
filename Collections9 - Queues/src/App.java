import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class App {

	public static void main(String[] args) {
		Queue<Integer>  q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of queu is: " + q1.element());
		
		try {
			q1.add(140);
		}catch (IllegalStateException e) {
			System.out.println("Too many items for the queue");
		}
		
		for(Integer value: q1) {
			System.out.println("Queue value: " + value);
		}
		
//		Integer value = q1.remove();
		
//		value = q1.remove();
		System.out.println("Removed from queue " + q1.remove());
		System.out.println("Removed from queue " + q1.remove());
		System.out.println("Removed from queue " + q1.remove());
		
		try {
			System.out.println("Removed from the queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many elements from the queue");
		}
		
		////////////////////////////////////////////////////////////////
		
		System.out.println();
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		q2.offer(19);
		q2.offer(20);
		if(q2.offer(21) == false) {
			System.out.println("Offer failed to add the item");
		}

		for(Integer value: q2) {
			System.out.println("Queue 2 value: " + value);
		}
		
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}
	
	

}
