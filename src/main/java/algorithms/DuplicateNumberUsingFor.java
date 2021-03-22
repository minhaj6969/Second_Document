package algorithms;



public class DuplicateNumberUsingFor {
	
	
	public static void main(String[] args) {
		
		int x [] = {2,4,3,5,6,5,2};
		
		for (int i=0; i<x.length-1; i++){
			
			for(int j=i+1; j<x.length; j++){
				
				if((x[i] == x[j]) && (i!=j)){
					
					System.out.println(x[j]);
				}
			}
		}
		
	}
}
	


