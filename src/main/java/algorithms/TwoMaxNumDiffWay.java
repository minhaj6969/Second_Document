package algorithms;

public class TwoMaxNumDiffWay {

	public static void main(String[] args) {
		
		int x[] = {1,3,5,6,4,7,34,10,3,0,-2,1};
		
		int maxone=0;
		int maxtwo=0;
		
		for(int n : x){
			
			if(maxone<n){
				
				maxtwo=maxone;
				maxone=n;
				
			}	
			
			else if(maxtwo<n){
				 maxtwo = n;
				 
			}	 
			
			
			
		}
		System.out.println(maxone);
		System.out.println(maxtwo);
		

	}

}
