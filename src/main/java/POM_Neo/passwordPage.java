package POM_Neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwordPage 
{
	//ck
	
	@FindBy(id = "txt_accesspin") private WebElement password;
	@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
	
	
	
	public  passwordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}

}
