package collectionsdemo;

public class ArrayDemo {

	public static void main(String[] args) {
		int x [] = {3,5,6,4,7,9};
		 System.out.println(x[2]);
		
		
		
		
		// if you want to display whole array then follow below
		// in case of x.length we can use l only 
		
		int l = x.length;
		System.out.println(l);
		for(int i = 0; i <x.length; i++){
			
			System.out.println(x[i]);
		}
		
		String names [] = {"raju","khan","babu"};
		System.out.println(names[1]);
		
		int s = names.length;
		System.out.println(s);
		for(int i = 0; i <names.length; i++){
			
			System.out.println(names[i]);
		}
		
		

	}

}
