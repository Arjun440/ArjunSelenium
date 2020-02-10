
public class numberformatexception {

	public static void main(String[] args) {
		
		try {
		int num=Integer.parseInt("Akil");
		System.out.println(num);
	} catch (NumberFormatException e)
		{
			System.out.println("number format exception");
		}
	}
}
