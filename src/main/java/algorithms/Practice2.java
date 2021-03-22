package algorithms;




public class Practice2 {
	
	
	public static void main(String[] args) {
		
		
		String s ="google";
		for (Character ch : s.toCharArray()) {
			
			if(s.indexOf(ch) == s.lastIndexOf(ch)){
				
				System.out.println(ch);
			}
			
		}
		
	}
}
	


