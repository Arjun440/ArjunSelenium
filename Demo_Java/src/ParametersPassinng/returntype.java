package ParametersPassinng;

public class returntype {

	public static void main(String[] args) {
		
		returntype obj=new returntype();
		
		int sum=obj.add(400, 500);
		
		System.out.println(sum);
		
		double Result = obj.sub(44.55, 23.55);
		
		System.out.println("Result is "+Result);
		
	}

	public int add(int a,int b) {
		
		int c=a+b;
		
		return c;
		
	}
	
	public double sub(double x,double y)
	
	{
		double Result =x-y;
		
		return Result;
	}
	
	
}
