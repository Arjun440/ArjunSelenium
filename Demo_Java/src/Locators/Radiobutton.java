package Locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Radiobutton {
	
	ChromeDriver driver;
	
  @Test
  public void checkboxes() {
	  
	 WebElement element=driver.findElement(By.name("option1"));
	  
	 element.click();
	 
	boolean ele= element.isEnabled();
	 
	 
	WebElement ele1=driver.findElement(By.name("option2"));
	
	ele1.click();
	
	boolean uncheck=ele1.isSelected();
	
	System.out.println("Element is selected "+uncheck);
	
	System.out.println("check boxes is displayed "+ele);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran -The Rock Star\\Desktop\\Selenium\\chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 
	driver.get("http://www.echoecho.com/htmlforms09.htm");
	 
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.close();
  }

}
