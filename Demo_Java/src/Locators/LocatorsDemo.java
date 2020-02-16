package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran -The Rock Star\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String expectedtitle="Gmail - free storage and email from google";
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String actualtitle=driver.getTitle();
		
	     if(actualtitle.equalsIgnoreCase(expectedtitle))
	     {
	    	 System.out.println("page title is "+actualtitle);
	     }
		
		
	}

}
