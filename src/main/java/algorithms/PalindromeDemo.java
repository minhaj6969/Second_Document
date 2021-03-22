package algorithms;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		String name ="racecar";
		String reverse = "";
		for(int i = name.length()-1; i >= 0; i-- ){
			
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		if (name.equals(reverse))
			System.out.println("It's a palindrome");
		else 
			System.out.println("it's not a palindrome");

	


	}

}
