package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	String url;
	
	@BeforeClass        //beforemethod is also used but will close the browser after method completed before class is best
	public void setupapplication()
	{
		Reporter.log("******Browser Session Starter******", true);
		
	    driver = new ChromeDriver();	    
	    driver.manage().window().maximize();
	    driver.get(url);
	    
	    Reporter.log("******Application Started******", true);
	}

	@AfterClass
	public void closeapplication()
	{
		driver.quit();
		Reporter.log("******Browser Session End******", true);
	}
	
}
