package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getallthelinks {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran -The Rock Star\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement ele : links) 
		{
			System.out.println(" "+ ele.getText());
		}


	}

}
