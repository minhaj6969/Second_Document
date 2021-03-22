package algorithms;



public class FrequencyNumber {
	
	
	public static void main(String[] args) {
		
		int x[]={1,23,2,23,23,25,6,64,54,6,8,7,9,10};
		
		int count=0,currentInt=0;
	    for (int i = 0; i < x.length; i++){
	    	
	    currentInt = x[i];
	    count=0;

	       for (int j = 0; j < x.length; j++)
	           {
	             if (currentInt == x[j])
	                {
	                  count++;
	                 }
	            }
	            System.out.println(count);
	      }
		
		
	}
}
	


