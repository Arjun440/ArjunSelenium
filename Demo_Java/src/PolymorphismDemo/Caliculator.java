package PolymorphismDemo;

public class Caliculator {
	
	
	public Caliculator(int a, int b) {
		
		int c=a+b;
		
		System.out.println("Caliculator 1st method "+c);
	}
	
	public Caliculator(int a, int b, int d) {
		
		int e=a+b+d;
		
		System.out.println("Caliculator 2nd method "+e);
	}

	public static void main(String[] args) {
		
		Caliculator obj=new Caliculator(5,10);
		Caliculator obj1=new Caliculator(50,20,55);
		
		

	}

}
