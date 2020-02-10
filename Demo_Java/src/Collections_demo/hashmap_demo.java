package Collections_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap_demo {

	public static void main(String[] args) {
		
	//Hashmap is a class implements map interface
	//Extends abstract map
	// It contains unique values
	//Stores the value in key - value pair
	//it may have one null key and multiple null values
	//it maintain no order
	//It's non synchronized - not thread safe
	
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		
		hm.put(1, "QTP");
		hm.put(2, "UFT");
		hm.put(3, "Selenium");
		hm.put(4, "Test Complete");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+ "  " +m.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Peter", 25, "Dev");
		Employee e2=new Employee("Prem", 27, "QA");
		Employee e3=new Employee("Richard", 28, "Product");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m: emp.entrySet() )
		{
			int key=m.getKey();
			
			Employee em=m.getValue();
			
			System.out.println(key + "Info :");
			
			System.out.println(em.name+" "+em.age+" "+em.dept);
			
		}
		
		

	}

}
