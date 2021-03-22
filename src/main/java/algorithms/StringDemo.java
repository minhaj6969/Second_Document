package algorithms;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String str = "Hello World";
		
		char array[] = new char[12];
		
		str.getChars(0, 11, array, 0);
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		System.out.println(array[10]);
		System.out.println(array[11]);


	}
	

}
