package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque_1 {

	public static void main(String[] args) {
		Deque<Integer> de=new ArrayDeque<Integer>();
//		
//		//LIFO  works as stack
		de.push(10);
		de.push(20);
		de.push(30);
		System.out.println(de);
		System.out.println(de.peek());
		System.out.println(de.poll());
		System.out.println(de.poll());
		System.out.println(de.poll());
		
//		System.out.println("******************");
		
		
		//FIFO works as queue
//		de.add(10);
//		de.add(20);
//		de.add(30);
//		System.out.println(de);
//		System.out.println(de.peek());
//		System.out.println(de.poll());
//		System.out.println(de.poll());
//		System.out.println(de.poll());
	}

}
