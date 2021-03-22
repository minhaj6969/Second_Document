package algorithms;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		//this is array and in array need to find length of array and for odd & even number need to be divisible by 2
		int x [] = {4,5,3,6,9,11,18,25};
		
		for (int i =0; i<x.length;i++){
			
			if (x[i] % 2 == 0)
				
				System.out.println("It is a even number :" + x[i]);
			else 
				
			System.out.println("It is an odd number :" + x[i]);
			
			
		}
		

	}

}
