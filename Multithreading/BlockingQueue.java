package multithreadingClass;

import java.util.LinkedList;
import java.util.Queue;


//wait allows the lock

//notifyall notify all the function to compete for the lock

//whenever the state notify it does not run directly it search for locks and fight for it.

public class BlockingQueue {
      
	
	private Queue<Integer> q; 
	private int capacity;
	
	public BlockingQueue(int cap) {
		q = new LinkedList<>();
		capacity = cap;
	}
	
	public boolean add(int item) {
		synchronized(q) {
			while(q.size () == capacity) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				q.add(item);
			q.notifyAll();
			return true;
		}
	}
	
	public int remove() {
		synchronized(q) {
		while(q.size() == 0) {
				try {
					q.wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			
			}
				
				int element = q.poll();
				q.notifyAll();
			    return element;
		}
	}
}
