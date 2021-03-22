package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer>  x  = new ArrayList<Integer>();
		
		x.add(3);
		x.add(6);
		x.add(10);
		x.add(7);
		System.out.println(x.get(1));
		x.remove(2);
		System.out.println(x.get(2));
		
		for(int i = 0; i <x.size(); i ++){
			
		System.out.println(x.get(i));
		
		}
		
		LinkedList <Integer> y = new LinkedList<Integer>();
		y.add(3);
		y.add(6);
		
		
		
		

	}

}
