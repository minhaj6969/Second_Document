package algorithms;

public class AddTwoNUmToGetHighest {

	public static void main(String[] args) {
		
		int x[] ={2,3,5,1,8,7};
		
		for (int i= 0; i<x.length; i++){
			
			int n1 = x[i];
			
			for (int j =i+1; j<x.length; j++){
				
				int n2 = x[j];
				if(n1+n2>10){
					
					System.out.println(n1);
					System.out.println(n2);
					
				}
			}
			
			
		}

	}

}
