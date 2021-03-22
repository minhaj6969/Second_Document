package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("sha");
		hs.add("hee");
		hs.add("shrif");
		hs.add("sha");
		System.out.println(hs.toString());
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()){
			
			System.out.println(it.next());
			
		}
		
		
		

	}

}
