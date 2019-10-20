package PolymorphismDemo;

public class Caliculator2 {
	
	
	public Caliculator2(int a, double b) {
		
		//up casting 
		double c=a+b;
		
		System.out.println("Caliculator 1st method "+c);
	}
	
	public Caliculator2(double a,int b) {
		
	double e=a+b;
		
		System.out.println("Caliculator 2nd method "+e);
	}

	public static void main(String[] args) {
		
		Caliculator2 Cal=new Caliculator2(55, 55.15);
		
		Caliculator2 cal1=new Caliculator2(100.14, 55);
		

	}

}
