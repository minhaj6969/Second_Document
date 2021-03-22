package algorithms;

public class SwapOrReverseNumDemo {

	public static void main(String[] args) {
		
		int x [] = {4,5,3,6,9,11,18,25};
		
		int temp = 0;
		
		// divided by two because swap it half of the time
		
		for (int i =0; i<x.length/2; i++){
			
			temp = x[i];
			x[i]= x[x.length-1-i];
			x[x.length-1-i] = temp;
			
		}
		for (int i =0; i<x.length;i++){
			
			System.out.println(x[i]);
		}
		

	}

}
