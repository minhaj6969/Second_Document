package algorithms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	
	
	public static void main(String[] args) {
		
		int x [] = {2,4,3,5,6,5,2};
		
		System.out.println("Duplicate value are : ");
		
		Set<Integer> s = new HashSet<Integer>();
		
		for (Integer no : x) {
			
			if(s.add(no)==false){
				
				System.out.println(no);
				
			}
			
			
		}
		
	}
}
	


