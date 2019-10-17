package ParametersPassinng;

public class ParametersDemo {

	public static void main(String[] args) {
		

		ParametersDemo obj1=new ParametersDemo();
		
		obj1.add(50, 60);
		
		obj1.sub(500.33, 33.10);
		obj1.strings("Selenium", "java");
	}
	
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("C value is "+c);
	
	}
	
	public void sub(double x,double y)
	{
		
		double Result = x-y;
		
		System.out.println("Result is "+Result);
	}
	
	public void strings(String firstname, String Lastname)
	{
		System.out.println("Firstname is "+firstname);
		System.out.println("Lastname is "+Lastname);
	}

}
