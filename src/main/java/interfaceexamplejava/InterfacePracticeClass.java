package interfaceexamplejava;

public class InterfacePracticeClass implements InterfacePractice,ExampleInterface {

	@Override
	public int getCoin() {
		
		int a =5;
		int b=10;
		int c = a+b;
		System.out.println(c);
		return 0;
	}

	@Override
	public String getString() {
		
		String a = "Minhaj";
		String b = "Ahmed";
		String c = a+b;
		System.out.println(c);
		
		return null;
	}
	public static void main(String[] args) {
		
		InterfacePracticeClass ds = new InterfacePracticeClass();
		ds.getCoin();
		ds.getString();
		ds.getMoney();
		
	}

	@Override
	public int getMoney() {
		
		int a =10;
		int b = 15;
		int c = a+b;
		System.out.println(c);
		return 0;
	}

}
