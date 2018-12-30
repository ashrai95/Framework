package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.ScreenshotUtility;

public class screenshot {
	
	
	@Test()
	public void captureScreenshot()
	{
 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("wwww.facebook.com");
		
		driver.findElement(By.xpath("")).sendKeys("ABC");
		
		ScreenshotUtility.captureScreenshot(driver, "TypeUserName");
		
		driver.quit();
	
		
	}
}
