package Utiity_Neo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Base_Neo.Base;

public class Utility extends Base
{
	//ck


	private static final String File = null;

	public static String readDataFromExcelSheet(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\software TestingNotes\\Automation Class\\selenium\\14) ExelSheetRead\\ExcelSheetTesting.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	    Reporter.log("Reading data from excel sheet", true);
	    Reporter.log("The value is "+value, true);
		return value;
	   
	}

	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\Admin\\ecilips2\\NeoStox_runnMVN\\NeoProperty.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		Reporter.log("Reading data from property file", true);
		Reporter.log("The value is "+value, true);
		return value;
		
	}
	
	public static void waiting(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Taking time"+time+"ms", true);
		
	}
	
	public static void scrollintoview(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scrolling into "+element.getText(), true);
		
	}
	
	public static void screenshot(WebDriver driver, String screenshotName) throws IOException
	{
	  	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\software TestingNotes\\Automation Class\\selenium\\7)ScreenShot\\Screenshots\\"+screenshotName+"png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		Reporter.log("taking screenshot ", true);
		Reporter.log("Screenshot stored at "+dest, true);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
