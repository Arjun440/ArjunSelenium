
public class ExceptionHandling {

//		int a =5;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uncaught Exception
//		
//		int i=5/0;
//		
//		System.out.println(i);
//		
		//Caught Exception
		
//		Thread.sleep(2000);
//		
//		ExceptionHandling obj =null;
//		
//		System.out.println(obj.a);
//		
//		//Try - Catch 
		
		//Try - Try block  contains set of statements where an exception occurs
		//Catch - Catch is used to handle the uncertain condition of try block 
		
		try {
			int i=5/0;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("End the block");
		}
	

	}


