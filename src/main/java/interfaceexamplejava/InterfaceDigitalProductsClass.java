package interfaceexamplejava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterfaceDigitalProductsClass implements InterfaceDigitalProduct {

	@Override
	public List<InterfacePractice> getWishList() {
		
		Map<Integer, String> mp = new HashMap<Integer,String>();
		mp.put(1, "First");
		mp.put(2, "two");
		mp.put(3, "Three");
		
		System.out.println(mp.get(2));
		
		
		
		return null;
	}
	public static void main(String[] args) {
		
		InterfaceDigitalProductsClass pl = new InterfaceDigitalProductsClass();
		
		pl.getWishList();
		
	}

}
