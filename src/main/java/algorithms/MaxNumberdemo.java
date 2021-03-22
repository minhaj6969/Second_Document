package algorithms;

public class MaxNumberdemo {

	public static void main(String[] args) {
		
		int x [] = {4,5,3,6,9,11,18,25};
		
		int max = 0;
		
		for (int i =0; i<x.length;i ++){
			
			
			if (x[i]>max)    //(max<x[i]) can be like that
			
				
				max = x[i];
			
		}
		System.out.println(max);

	}

}
