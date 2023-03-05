package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(2);
        
		List<StudentMarks> stMarks = new ArrayList<>();
		stMarks.add(new StudentMarks(70,80));
		stMarks.add(new StudentMarks(38,10));
		stMarks.add(new StudentMarks(100,38));
		stMarks.add(new StudentMarks(40,88));
		stMarks.add(new StudentMarks(97,19));
		
		
		Set<Integer> set1 = new HashSet<>(aList);
//		System.out.println(set1.contains(1));
//		System.out.println(set1.contains(200));
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(2);
		set2.add(0);
//		
//		Set<Integer> set3 = new LinkedHashSet<>();
//		set3.add(2);
//		set3.add(3);
//		set3.add(4);
//		set3.add(2);
//		set3.add(0);
		
		 
//		Set<StudentMarks> set3 = new HashSet<>(stMarks);
//		
//		
//		System.out.println(set3.contains(new StudentMarks(70, 80)));
//		
//		
//		
//		
////		for(int x: set2) {
////			System.out.print(x + ",");
////		}
////		
////		System.out.println();
//		
//		for(StudentMarks x: set3)
//			System.out.print(x + ",");
		
//		System.out.println(set1);
//		System.out.println(set2);
//		
//		System.out.println("after retaining");
//		
////		set1.retainAll(set2); // give intersection of two sets
//
////		set1.removeAll(set2); // give the difference between two sets
//		set1.addAll(set2);  // union of two sets
//		System.out.println(set1);
//		System.out.println(set2);

		
		
//		Set<StudentMarks> treeSet = new TreeSet<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());;
//		treeSet.add(new StudentMarks(70,80));
//		treeSet.add(new StudentMarks(38, 10));
//		treeSet.add(new StudentMarks(100,38));
//		treeSet.add(new StudentMarks(40,88));
//		treeSet.add(new StudentMarks(97,19));
//		
//		for(StudentMarks x: treeSet)
//			System.out.println(x + ",");
		
		
//		NavigableSet<Integer> set5 = new TreeSet<>();
//		set5.add(8);
//		set5.add(3);
//		
//		set5.add(1);
//		set5.add(0);
//		
//		for(int x: set5)
//			System.out.print(x + ",");
//		
//		//methods of navigable set
//		
//		System.out.println();
//		System.out.println(set5.floor(1));
//		System.out.println(set5.ceiling(2));
//		System.out.println(set5.lower(2));
//		System.out.println(set5.higher(3));
		
   /* Map use case */
		
		
//		Map<String, Integer> map = new HashMap<>();
//		map.put("ridhi", 1);
//		map.put("raj", 2);
//		map.put("chandler", 7);
//		
//		map.remove("raj");
//		
//		
//		
////		System.out.println(map.get("ridhi"));
//		
//		System.out.println(map.getOrDefault("djsk", 0));
//		System.out.println(map.getOrDefault("raj", 2));
//		
//		System.out.println(map.containsKey("Key"));
//		
//		Map<Integer, List<Integer>> adj = new HashMap<>();
//		
////		if(adj.get(1) == null)
////			adj.put(1, new ArrayList<>());
////		adj.get(1).add(2);
////		
////		adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);
//		
//		//make a map iterable using Set
//		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		for(Map.Entry<String, Integer> entry: entrySet)
//			System.out.println(entry.getKey() + "," + entry.getValue());
//		
//		Set<String> keySets = map.keySet();
//		for(String key: keySets)
//			System.out.println(key + "," + map.get(key));
		
		
		
//		
//		NavigableMap<Integer, String> tmap = new TreeMap<>();
//		tmap.put(1,"ridhi");
//		tmap.put(2, "raj");
//		tmap.put(7, "chandler");
////		tmap.remove(2);
//		
//		System.out.println(tmap);
//		
//		Set<Map.Entry<Integer, String>> entrySet = tmap.entrySet();
//		for(Map.Entry<Integer, String> entry: entrySet)
//			System.out.println(entry.getKey() + "," + entry.getValue());
//		
//		
//		System.out.println(tmap.pollFirstEntry());
//		
//		System.out.println(tmap.ceilingKey(3));
//		
		
		
		
		Integer arr[] = new Integer[] {1, 2, 3, 0, 1, 5, 10,7};
		Arrays.sort(arr);
		
		List<Integer>list = Arrays.asList(arr);
		
		
		
		
		
		
	}

}
