package Advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
//		ArrayList li = new ArrayList();
//		li.add("Velocity");
//		li.add(56);
//		li.add('z');
//		li.add(null);
//		li.add(null);
//		
//		System.out.println(li.get(2));
//		System.out.println(li.get(3));
//   
		//if we declare generi then it will be homogenous in nature
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		li.add(654);
//		li.add(45);
//		li.add(45);
//		
//		System.out.println(li.get(2));
		
//		Vector v = new Vector();
//		v.add("String");
//		v.add(454);
//		v.add(null);
//		
//		Iterator i = v.iterator();	
//		System.out.println(i.next());
		
//		HashSet hs = new HashSet();
//		hs.add("Velocity");
//		hs.add("Velocity");
//		hs.add(null);
//		hs.add(null);
//		hs.add("Katraj");
//		hs.add(67);
//		
//		Iterator i =hs.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, null);
		hm.put(null, null);
		hm.put(null, "katraj");
		hm.put(null, "d");
		hm.put(2, null);
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		
		
		Hashtable ht = new Hashtable();
		ht.put(1, 57);
		ht.put(1, 67);
		//ht.put(null, "Hello"); wee cannot save null values
		//ht.put(5, null);
		
		System.out.println(ht.get(1));
		
		
		
		
		
		
		
} 
}