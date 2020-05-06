package collectionsExample;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(null);
		//list.add(10.25);
		
		int i = list.get(0);
		System.out.println(i);

	}

}
