package StringDemo;

public class Stringdemo2 {

	public static void main(String[] args) {
		
	String Actual="welcomes to India";
			
		String expected ="Welcome to selenium Webdriver class";
		
		boolean status=Actual.equalsIgnoreCase("Welcomes to India");
		
		boolean Status2=expected.contains("QTP");
		
		System.out.println("Status2 is "+Status2);
		
		//System.out.println("Status is "+status);

	}

}
