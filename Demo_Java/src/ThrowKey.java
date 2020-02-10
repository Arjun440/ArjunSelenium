
public class ThrowKey {

	public static void main(String[] args) {
	
	System.out.println("ABC");
		String Excu_Flag="N";
		if(Excu_Flag.equals("N")) {
			try {
				
				//throw new Exception("Exec flag is blank exception");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("BBC");
		}

	}

}
