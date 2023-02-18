package base_Neo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;
import utiity_Neo.Utility;

public class Base 
{
	//ck
	
	protected static WebDriver driver;
	
	public void lounchBrowser() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
//		driver.get(Utility.readDataFromPropertyFile("url"));
//		Utility.waiting(1000, driver);
//	
	}

}
