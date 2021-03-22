package algorithms;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String str ="google";
		String [] chars = str.split("");
		Set<String> unichar = new LinkedHashSet<String>();
		for (String s : chars) {
			
			
			if(unichar.add(s)==true){
							
			System.out.println(s);
						
			}
			
			
			
		}

	}

}
