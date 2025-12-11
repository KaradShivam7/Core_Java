package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydeque2 {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq.pollLast());
	}

}
