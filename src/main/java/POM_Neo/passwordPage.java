package pom_Neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiity_Neo.Utility;

public class PasswordPage 
{
	//ck
	
	@FindBy(id = "txt_accesspin") private WebElement password;
	@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
	
	
	
	public  PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String passwordNo)
	{
		password.sendKeys(passwordNo);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
		Utility.waiting(1000, driver);
		submitButton.click();
	}

}
