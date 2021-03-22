package algorithms;

public class SecondMaxNum {

	public static void main(String[] args) {
		
		
		int x [] = {2,4,7,9,23,26,27};
		
		int max = 0;
		int maxsecond = 0;
		
		for(int i = 0; i<x.length; i ++){
			
			if (x[i]>max){
				
				maxsecond = max;
			    max = x[i];
			} 
			else if (x[i] > maxsecond)
			    	maxsecond = x[i];
				
		}
		
		System.out.println("First max number:" + max);
		System.out.println("Second max number:" + maxsecond);

	}

}
