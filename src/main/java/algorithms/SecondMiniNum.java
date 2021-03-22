package algorithms;

public class SecondMiniNum {

	public static void main(String[] args) {
		
		
		int x [] = {3,5,7,1,16,80};
		
		int min = 100;
		int secondmin = 100;
		
		for (int i = 0; i<x.length; i ++){
			
			if (x[i] < min){
				
				secondmin = min;
				min = x[i];
				
			}
			else if(x[i]<secondmin){
				
				secondmin = x[i];
			}
		}
		System.out.println("First min number:" + min);
		System.out.println("Second min number:" + secondmin);
		
		

	}

}
