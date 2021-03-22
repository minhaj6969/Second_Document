package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateValueInDifferent {
	
	
	public static void main(String[] args) {
		
		int x[] ={1,2,3,5,7,9,1,4,3,6,2,1};	
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		
		for (int no : x) {
			
			Integer count =mp.get(no);
			
			if(count==null){
				
				mp.put(no, 1);
			}
			else{
				
				count = count+1;
				mp.put(no, count);
				
			}
			
		}
		
		System.out.println("Duplicates value are : ");
		
		Set<Map.Entry<Integer,Integer>> hs =mp.entrySet();
		for (Map.Entry<Integer, Integer> en : hs) {
			
			if(en.getValue()>1){
				
				System.out.println(en.getKey()+"");
			}
			
		}
		

		
	}
}
	


