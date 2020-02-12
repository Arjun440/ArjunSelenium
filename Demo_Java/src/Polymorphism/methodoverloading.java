package Polymorphism;

public class methodoverloading {
	
	
	public void fun(int a)
	{
		System.out.println(" Lets integer have a fun :"+a);
	}
	
	public void fun(String str)
	{
		System.out.println(" Print the Rowdy name :"+str);
	}
	
	public void fun(double a,double b)
	{
		System.out.println(" Multiply the a and b :"+a*b);
	}
	

	public static void main(String[] args) {
		
		methodoverloading obj=new methodoverloading();
		
		obj.fun(10);
		obj.fun("Rowdy");
		obj.fun(12, 5);

	}

}
