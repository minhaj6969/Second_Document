package algorithms;

import java.util.HashMap;

public class NumOccurInString {
	
	
	public static void main(String[] args) {
		

		String s= "google";
		HashMap<String, Integer> hs = new HashMap();
		for(char c : s.toCharArray()){
			String str = c+"";
			if(!hs.containsKey(str)){
				hs.put(str, 1);
			}else{
				hs.put(str, hs.get(str)+1);
			}
		}
		System.out.println(hs);
		
	}
}
	


