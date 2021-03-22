package algorithms;



public class MoveZeroToEnd {
	
	
	public static void main(String[] args) {
		
		int x[]={1,0,23,0,0,2,23,23,2};
		

        int Count = 0;
        int lastIndex = x.length-1;

        for(int i = lastIndex-1; i >=0; i--) { 
            if(x[i] == 0) {
                x[i] = x[lastIndex-Count];
                x[lastIndex-Count] = 0;
                Count++;
            }
        }

        for(int i : x) {
            System.out.print(i + ", ");
        }
		
		
		
	}
}
	


