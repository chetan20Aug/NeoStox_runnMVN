package pom_Neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileNoPage
{
	//ck
	
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNo;
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	
	
	public  MobileNoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNo(String Mobile)
	{
		mobileNo.sendKeys(Mobile);
		
	}
	public void clickOnSignInBittoN()
	{
		signInButton.click();
	}

}
