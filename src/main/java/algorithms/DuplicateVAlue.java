package algorithms;

import java.util.HashSet;

public class DuplicateVAlue {
	
	
	public static void main(String[] args) {
		
		int x[] ={1,2,3,5,7,9,1,4,3,6,2,1};	
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i<x.length; i++){
			
			hs.add(x[i]);
			
			
		}
		System.out.println(hs);
		
		
		

		
	}
}
	


