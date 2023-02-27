package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        OurGenericList<Integer> list = new OurGenericList<>();
		List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(2);
        
        
        Integer [] arr = aList.toArray(new Integer[0]);
        
        for(int x: arr)
        	System.out.print(x + ",");
        
        
        //Stack -> ArrayDeque
        //QUEUE -> LinkedList
        
//        System.out.println("element that got replaced = " + aList.set(1, 100));
        
//        
//        List<Integer> aList2 = new ArrayList<>();
//        aList2.add(4);
//        aList2.add(5);
//        aList2.add(6);
//        
//        aList2.addAll(aList);  
//        
//        System.out.println(aList.lastIndexOf(2));
//        
//        //subList makes a view of original List its a type Shallow copy
//        List<Integer> aList3 = aList2.subList(1,4);
//        aList3.set(0, 100);
//        System.out.println(aList3);
//        
////        Iterator<Integer> iterator = list.iterator();
////        while(iterator.hasNext()){
////        	System.out.println(iterator.next());
////        }
//        
//        
//        
////        System.out.println(aList);
//        System.out.println(aList2);
//        
////        //unboxing in java 
////        for(int x: aList)
////        	System.out.println(x);
        
//        LinkedList<Integer> Linked1 = new LinkedList<>();
//        Linked1.add(1);
//        Linked1.add(2);
//        Linked1.add(3);
//        
//        ListIterator<Integer> iterator = Linked1.listIterator();
//        
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous());     
//        
	}

}
