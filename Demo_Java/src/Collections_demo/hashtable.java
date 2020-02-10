package Collections_demo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class hashtable {

	public static void main(String[] args) {
		
		//it is similar to hashmap but it is synhronised
		//hashtable stores key and values pair format
		//key--> Object--->hashcode-->values
		//null -not null key or values are not allowed
		//Hashtable will not allo the duplicate values
		
		
		Hashtable h=new Hashtable();
		h.put(1, "Hikari");
		h.put(2, "Test");
		h.put(3, "Java");
		h.put(4, "Angular");
		
		//Create a clone/copy
		Hashtable h1=new Hashtable();
		h1=(Hashtable) h.clone();
		
		System.out.println("The values from h "+h);
		System.out.println("The values from h1 "+h1);
		
		h1.clear();
		System.out.println("The values from h "+h);
		System.out.println("The values from h1 "+h1);
		
		//Contains Value:
		
		Hashtable ht=new Hashtable();
		ht.put("A", "Karma");
		ht.put("B", "Weldi");
		ht.put("C", "Java");
		ht.put("D", "Selenium");
		ht.put("D", "Selenium");//Contains Unique values/Keys
		ht.put(null,"java");// - not allowed the null
		
		if (ht.containsValue("Karma")) {
			
			System.out.println("Value will be print");
			
		}
		
		//Print all the values from hashtable
		Enumeration e=ht.elements();
		System.out.println("Print values from hashtable");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//Get the values from hashtable
		System.out.println("Get the values from the Hashtable");
		Set s=ht.entrySet();
		
		System.out.println(s);
		//Check the both hashtable are equal or not
	
		Hashtable ht1=new Hashtable();
		
		ht1.put("A", "Karma1111");
		ht1.put("B", "Weldi");
		ht1.put("C", "Java");
		ht1.put("D", "Selenium");
		
		if (ht.equals(ht1)) {
			
			System.out.println("Both are equal");
			
		}
		
		System.out.println(ht1.get("A"));
		
		//Hashtable ht3=new Hashtable();
		System.out.println(ht1.hashCode());
		
	}

}
