package algorithms;

public class FizzBuzzDemo {

	public static void main(String[] args) {
		
		
		int x[] = {5,3,15,20,30,50};
		 
		for (int i = 0; i<x.length; i++){
			
			if (x[i]%3==0 & x[i]%5 == 0)
				
				System.out.println("FizzBuzz");
			
			else if (x[i]%3==0)
				
				System.out.println("Fizz");
			
            
			else if (x[i]%5 == 0)
				
				System.out.println("Buzz");
			
		}

	}

}
