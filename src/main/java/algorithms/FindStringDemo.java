package algorithms;

public class FindStringDemo {

	public static void main(String[] args) {
		
		String name = "CareerHack";
		
		char find = 'k';
		 int position = 0;
		 for (int i = 0; i<name.length(); i ++){
			 
			 if(find == name.charAt(i))
				 position= i;
		 }
		 System.out.println(position);
		 

	}

}
