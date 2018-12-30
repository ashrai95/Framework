package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;

public class HomeConfig 
{
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public void HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	public void perform_Search(String search) {
		driver.navigate().to(configFileReader.getApplicationUrl() + "/?s=" + search + "&post_type=product");
	}
	
	public void navigateTo_HomePage() {
		driver.get(configFileReader.getApplicationUrl());
	}

}
