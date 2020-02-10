import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class filenotfoundexception {
	
	
	public static void main(String[] args) {
		try {
		File f=new File("‪C:\\Users\\Kiran -The Rock Star\\Desktop\\Test.xlsx");
		
		FileReader fr=new FileReader(f);
		
	}
		
		catch (FileNotFoundException e) {

			System.out.println("File doesn't exists");
		}
	}

}
