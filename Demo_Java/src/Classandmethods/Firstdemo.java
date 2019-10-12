package Classandmethods;

public class Firstdemo {
	
	int X=100;
	int y=200;
	
	public static void main(String[] args) {
		
		Firstdemo obj1=new Firstdemo();
		
		obj1.sum();
		
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1.X);
		System.out.println(obj1.y);
		
		Firstdemo obj2=new Firstdemo();
		
		System.out.println(obj2.hashCode());
		obj2.sum();
		
	
	}
	
	public void sum()
	{
		int a =10;
		int b=20;
		int c=a+b;
		
		System.out.println("Sum of values is "+c);
	}

	
		
		


}
