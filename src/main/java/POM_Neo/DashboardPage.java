package pom_Neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utiity_Neo.Utility;

public class DashboardPage 
{
	//ck
	
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
//	@FindBy(id = "txt_instruments1") private WebElement searchCompany;
//	@FindBy(xpath = "//*[@id=\"ui-id-282\"]/div/div[3]/button") private WebElement addInList;
//	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/div[4]") private WebElement someware;
	@FindBy(xpath = "//*[@id=\"aspnl_6401\"]/div[1]/div[1]") private WebElement comp;
	@FindBy(id = "lbl_username") private WebElement username;
	@FindBy(xpath = "//*[@id=\"lnk_logout\"]/span[2]") private WebElement logOutBotton;

	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void handlePopUp()
	{
		okButton.click();
	}
	
//	public void searchComp(String company,WebDriver driver)
//	{
//		searchCompany.sendKeys(company);
//		Utility.waiting(1100, driver);
//		addInList.click();
//		Utility.waiting(1100, driver);
//		someware.click();
//	}
	
	public String compName()
	{
		 String actualCompanyName = comp.getText();
		 Reporter.log(actualCompanyName, true);
		return actualCompanyName;
	}
	
	public void logOut()
	{
		username.click();
		logOutBotton.click();
	
	}
	
	
	
	
}
