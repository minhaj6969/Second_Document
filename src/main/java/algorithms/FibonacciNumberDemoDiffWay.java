package algorithms;

public class FibonacciNumberDemoDiffWay {

	public static void main(String[] args) {
		
		int x [] = {1,2,3,4,5,6,7,8,9,10};
		
		 
		for(int i=2;i<x.length; i++){
			
			x[i] =x[i-1]+x[i-2];
		}
		for (int i : x) {
			
			System.out.println(i);
			
		}


	}

}
