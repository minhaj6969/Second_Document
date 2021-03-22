package algorithms;

public class MinNumberDemo {

	public static void main(String[] args) {
		
		int x [] = {4,5,3,6,9,11,18,25};
		
		int min = 30;
		
		for (int i =0; i<x.length;i ++){
			if ( x[i] <min)
				
				min = x[i];
			
		}
		System.out.println(min);

	}

}
