package p3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1 , "One"); // put method used for insertion
		map.put(1, "Updted-One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(3, "Updted-Three");
		map.put(4, "Four");
		map.put(5, "Four");
		map.put(1, "new Value");
		
		
		
		System.out.println(map);
		
		System.out.println("\n--------Iterator on Key's ------------\n");
		
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext())
		{
			int key =itr.next();
			System.out.println(key+"\t-\t"+map.get(key));
		}
		
		System.out.println("\n--------Map Entry ------------\n");
		
		for (Entry<Integer, String> entry: map.entrySet()) {
			System.out.print(entry+"\t"+entry.getKey()+"- "+entry.getValue()+"\n");
		}
		
	}

}
