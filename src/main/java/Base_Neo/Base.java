package Base_Neo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utiity_Neo.Utility;

public class Base 
{
	//ck
	
	protected static WebDriver driver;
	
	public void lounchNeoStox() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(Utility.readDataFromPropertyFile("url"));
		Utility.waiting(1000, driver);
	
	}

}
