package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("lastName", "Gregorio");
		map.put("firstName", "Janielle");
		map.put("sub", "Selenium");
		map.put("location", "Philippines");
		map.put("firstName", "Joy");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("firstName"));
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			
			System.out.println("Key --> "+ key + " Value is --> " + map.get(key));
		}
		
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		
		List<String> listofEmails = new ArrayList<String>();
		listofEmails.add("testing123@gmail.com");
		listofEmails.add("selenium.automation@yahoo.com");
		listofEmails.add("java_test@outlook.com");
		listofEmails.add("tester13@automation.com");
		
		map1.put("email", listofEmails);
		
		Map<String, Map<String, String>> map2 = new HashMap<String, Map<String, String>>();
	}

}
