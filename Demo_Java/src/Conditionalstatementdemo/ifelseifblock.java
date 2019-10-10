package Conditionalstatementdemo;

public class ifelseifblock {

	public static void main(String[] args) {
		
System.out.println("TC execution started");
		
		String browser = "Yeshwitha";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC excute on chrome browser");
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC execute on firefox browser");
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC execute on IE browser");
		}
		
		else {
			
			System.out.println("Provide the proper browser name");
		}
		
		System.out.println("TC execution End");


	}

}
