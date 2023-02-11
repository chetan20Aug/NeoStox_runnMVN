package POM_Neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
	//ck
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signInButton;


	public  SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSignInButton()
	{
		
		signInButton.click();
		
	}


}
