package ParametersPassinng;



public class parameterdemo {

	public static void main(String[] args) {
		
		DynamicCaliculator obj1=new DynamicCaliculator();
		
	int sum=obj1.add(50, 60);
	
	System.out.println("Sum of the value is"+sum);
		
		double Result =obj1.sub(500.33, 33.10);
		
		System.out.println("Result of the method is "+Result);
		
		String Name=DynamicCaliculator.Getmydetails("Selenium", "Java");
		
	System.out.println("Name is "+Name);

	}

}
