package algorithms;

public class CountWordInSentence {
	
	public static int countWords(String input){
		
		
		if(input==null || input.isEmpty() ){
			
			return 0;
		}
		String [] words = input.split("\\s");
		return words.length;
		
	}
	public static void main(String[] args) {
		
		int i = CountWordInSentence.countWords("There are few students in a class");
		System.out.println(i);
	}

}
