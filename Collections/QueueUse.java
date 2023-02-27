package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FIFO Queue implementing Queue -> LinkedList
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        
//        System.out.println(q.isEmpty());
//        
//        //Stack is LIFO
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        
//        while(!stack.isEmpty()) {
//        	System.out.println(stack.peek());
//        	stack.pop();
//        }
		
		//Double ended Queue we will use ArrayDEQUE we can use to build Stack but we have stack so it will be unnecessary
//		Deque<Integer> dq = new ArrayDeque<>();
//		dq.offerLast(1);
//		dq.offerLast(2);
//		System.out.println(dq);
//		
//		dq.pollFirst();
//		dq.peekFirst();
//		System.out.println(dq);
		
		//Comparable -> NaturalOrdering
		//Comparator -> TotalOrdering
		//What if we want top2 elements of bottom2?
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
		
		pq.offer(1);
		pq.offer(2);
		pq.offer(0);
		pq.offer(100);
		
		
		//top 2 Element
		
		List<Integer> bottom2 = new ArrayList<>();
		int index = 0;
		while(!pq.isEmpty()) {
			if(index == 2)
				break;
			bottom2.add(pq.poll());
			index++;
		}
//		System.out.println(bottom2);
//		
//		System.out.println(pq);
        
  /* get me the top 3 student according to their maths marks*/
		//Comparator and Comparable
		
		
		List<StudentMarks> stMarks = new ArrayList<>();
		stMarks.add(new StudentMarks(70,80));
		stMarks.add(new StudentMarks(38,10));
		stMarks.add(new StudentMarks(100,38));
		stMarks.add(new StudentMarks(40,88));
		stMarks.add(new StudentMarks(97,19));
		
        
		PriorityQueue<StudentMarks> spq = new PriorityQueue<StudentMarks>((s1, s2) -> {
			System.out.println("comparable's compare to () is called");
			return s2.getMaths() - s1.getMaths();
		});
		
		for(StudentMarks sm: stMarks)
			spq.add(sm);
		List<StudentMarks> top3 = new ArrayList<>();
	    index = 0;
		while(!spq.isEmpty()) {
			if(index == 3)
				break;
			top3.add(spq.poll());
			index++;
		}
		
		System.out.println(top3);
		
		
	}

}
