package StringDemo;

public class SplitDemo {

	public static void main(String[] args) {
		
		String Fullname="Selenium-HP-Grid-Loadrunner";
		
		String  []Toolname=Fullname.split("-");
		
		for(int i=0;i<Toolname.length; i++)
			
		{
			System.out.println("Value for "+ i +Toolname[i]);
		
			if(Toolname[i].equalsIgnoreCase("Grid"))
			{
				System.out.println("Test Passed");
				break;
			}
		}

	}

}
