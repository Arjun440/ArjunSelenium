package Locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Checkboxes {
	
	ChromeDriver driver;
	
  @Test
  public void Checkboxes1() {
	  
	
	  
	List<WebElement> elements=driver.findElements(By.className("table5"));
	
	int size=elements.size();
	
	System.out.println(size);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran -The Rock Star\\Desktop\\Selenium\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 
		driver.get("http://www.echoecho.com/htmlforms09.htm");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
