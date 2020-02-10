package JavaProgrammes;

import javax.management.RuntimeErrorException;

public class finallyConcept {

	public static void main(String[] args) {
		
		//test();
		//test1();
		division();
	}
	
	public static void test() {
		
		try {
			
			System.out.println("Inside test method");
			
			throw new RuntimeException("Test");
			
		} catch (Exception e) {

			System.out.println("Inside the Catch block");
		}
		
		finally 
		{
			System.out.println("Inside the finally block");
		}
	}
		public static void test1() {
			
			try {
				
				System.out.println("Inside test method");
				
			}
			
			finally 
			{
				System.out.println("Finally is in test1 method");
			}
		}	
		public static void division()
		{
			
			int i=10;
			
			try {
				System.out.println("Inside the try block ");
				int k=i/0;
				
			} catch (NullPointerException e) {
				
				System.out.println("Inside the Catch block");
			}
			finally
			{
				System.out.println("excute this code even after exception");
			}
			
		}
	}
	


