package multithreadingClass;
/* Important points*/
//synchronization with Stack synchronized Methods and blocks
//static-> static.class
// non-static -> this
//Race Condition : It occurs when two or more threads simultaneously update the same value (stackTopIndex) and, as a consequence, leave the value in an undefined or inconsistent state
//StringBuffer it is a thread Safe class 

//Singleton class we can only make one object class

//ENUMS PROVIDE THREAD SAFETY

public class Stack {
          private int[] array;
          private int stackTop;
          Object lock;
         
          
          public Stack(int capacity) {
        	  array = new int[capacity];
        	  stackTop = -1;
        	  lock = new Object();
          }
          
          public synchronized boolean push(int element) {
        	  //Critical Section allows only one thread at a time
        	  
        		  if(isFull()) return false;
            	  ++ stackTop;
            	  
            	  try {
            		  Thread.sleep(1000);
            	  } catch(Exception e) {}
            	  
            	  array[stackTop] = element;
            	  return true;
        	  }
        	
        
          
          public synchronized int pop() {
        		  if(isEmpty()) return Integer.MIN_VALUE;
            	  int obj = array[stackTop];
            	  array[stackTop] = Integer.MIN_VALUE;
            	  
            	  try {
            		  Thread.sleep(1000);
            	  }
            	  
            	  catch (Exception e) {
            		  
            	  }
            	  stackTop--;
            	  return obj;
        	  }

          
          
          public boolean isEmpty() {
        	  return stackTop < 0;
          }
          
          public boolean isFull() {
        	  return stackTop >= array.length - 1;
          }
}
