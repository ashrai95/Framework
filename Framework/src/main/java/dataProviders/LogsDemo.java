package dataProviders;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogsDemo {

	public static void main(String[] args) {
		
		Logger logger	= Logger.getLogger("LogsDemo");  // Here we need to create logger instance so we need to pass Class name for  which  we want to create log file
		
       PropertyConfigurator.configure("log4j.properties"); // configure log4j properties file
	
       System.setProperty("webdriver.gecko.driver","src\\demo\\geckodriver.exe");
       
        WebDriver driver = new FirefoxDriver();  // Open browser
	    logger.info("Browser Opened");
		
	    
	    	    
	    // Set implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 logger.info("Implicit wait given");
			
		// Load application
		 driver.get("https://www.google.co.in/");
		 logger.info("Url opened");
			
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 logger.info("keyword type");
		 
	}

}
