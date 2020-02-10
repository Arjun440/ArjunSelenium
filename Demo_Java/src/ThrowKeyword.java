
public class ThrowKeyword {

	public static void main (String[] args)  {
		
		ThrowKeyword obj=new ThrowKeyword();
		
		obj.sum();
		
	}
		
		public void sum() 
		{
			try {
			div();
		} 
			catch (ArithmeticException e)
			{
				e.printStackTrace();
			 System.out.println("Exception handled");
			}
		}
		public void div() throws ArithmeticException{
			
			int i =5/0;
		}
	
		

}
