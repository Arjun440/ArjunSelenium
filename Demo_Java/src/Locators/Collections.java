package Locators;

import java.util.HashMap;
import java.util.Map;

public class Collections {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1, "Taurus");
		m.put(2,"Jasmine");
		
		System.out.println(m.get(2));
	}

}
