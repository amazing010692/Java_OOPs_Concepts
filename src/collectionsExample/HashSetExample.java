package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Janielle");
		set.add("Gregorio");
		set.add("Selenium");
		set.add("Appium");
		set.add("Janielle");
		
		System.out.println(set);
		
		/*for (int i = 0; i < set.size(); i++) {
			
			System.out.println(i);
		}*/
		
		/*for(String var : set) {
			
			System.out.println(var);
		}*/
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			String var = itr.next();
			if(var.equals("Appium")) {
			System.out.println(var);
			}
		}

	}

}
