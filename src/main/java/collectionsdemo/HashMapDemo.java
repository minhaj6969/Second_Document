package collectionsdemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer, String > hm = new HashMap<Integer, String >();
		hm.put(1, "name");
		hm.put(2, "address");
		hm.put(3, "mail");
		
		
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));

	}

}
