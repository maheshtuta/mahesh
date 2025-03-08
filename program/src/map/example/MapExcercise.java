package map.example;

import java.util.*;
import java.util.Map.Entry;

public class MapExcercise {

	public static void main(String[] args) {
		Map<Integer,String> mp = new Hashtable<>();
		
	mp.put(1, "Mahesh");
	mp.put(2, "kanna");
	mp.put(3, "Mahesh");
	//System.out.println(mp);
//	mp.putIfAbsent(3, "Mahesh");
//	System.out.println(mp);
//	mp.clear();
//System.out.println(mp.size());
//	Set<Integer> values =mp.keySet();
//	for (Integer value : values) {
//		System.out.println(value);
//	}
	//System.out.println(mp.entrySet());
//              Set<Entry<Integer,String>>Values = mp.entrySet();
//              for(Entry<Integer,String> Value : Values) {
//            	  System.out.println(Value);
//              }
              //Collection<String> values = mp.values();
	System.out.println(mp.get(3));
	

	}

}
