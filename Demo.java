package com.impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Demo {
	
	public static void main(String args[])
	{
		//List al = new ArrayList();
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Amit");
//		al.add("Ankit");
//		al.add("Chanda");
//		al.add("Chanda");
//		System.out.println(al);
//		System.out.println(al.get(4));
//		 ListIterator<String> iterator = al.listIterator();
//		 while(iterator.hasNext())
//		 {
//			 System.out.println(iterator.next());
//		 }
		
		
		//TreeSet<String> tree = new TreeSet<String>();
		
//		tree.add("Amit");
//		tree.add("Aniket");
//		tree.add("Amit");
//		System.out.println(tree);
//		tree.add("Ravi");
//		tree.add("Chanda");
//		System.out.println(tree);
//		tree.add("Bhanu");
//
//		System.out.println(tree);
		
//		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
//		
//		hashSet.add("Amit");
//		hashSet.add("Amir");
//		hashSet.add("Amit");
//		hashSet.add("Chanda");
//		hashSet.add("Ravi");
//		System.out.println(hashSet);
		
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		hashSet.add(5);
//		hashSet.add(0);
//		hashSet.add(0);
//		hashSet.add(1);
//		hashSet.add(8);
//		System.out.println(hashSet);
//		
//		Iterator<Integer> iterator = hashSet.iterator();
//		
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//					
//			
//		}
		
//   HashMap<String, String> hashMap = new HashMap<String, String>();
//   
//   hashMap.put("name", "Amit");
//   hashMap.put("id", "Amit");
//   hashMap.put("college", "Amit");
//   hashMap.put("College", "GIT");
//
//   hashMap.put("name", "Abbha");
//   System.out.println(hashMap);
		
		
//		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
//		
//		treeMap.put(1, "Amit");
//		treeMap.put(5, "Aniket");
//		treeMap.put(3, "Chanda");
//		treeMap.put(2, "Ravi");
//		
//		Set  set = treeMap.entrySet();
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext())
//		{
//			Map.Entry<Integer, String> entry =  (Entry<Integer, String>) iterator.next();
//			System.out.println("The key is:"+entry.getKey()+" and the value corresponding to it is:"+entry.getValue());
//			
//			
//		}
		
		Map<Integer, String> treeMap = new LinkedHashMap<Integer, String>();
		treeMap.put(1, "Amit");
		treeMap.put(2, "Ayush");
		treeMap.put(3, "Aakash");
		treeMap.put(5, "Shreeya Joshi");
		treeMap.put(4,"Shreeya Mishra");
		
		
		System.out.println(treeMap);
		
		Set<Entry<Integer, String>> set = treeMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> entry = iterator.next();
			
			System.out.println("The key is:"+entry.getKey()+" and the value corresponding to it is:"+entry.getValue());
			
			
		}
		
		
		
		
		
		
		
		
		
			
		 
	}
}
