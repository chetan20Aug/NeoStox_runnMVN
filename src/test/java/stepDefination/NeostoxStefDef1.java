package stepDefination;

import java.io.IOException;

import org.junit.Assert;

import base_Neo.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_Neo.DashboardPage;
import pom_Neo.MobileNoPage;
import pom_Neo.SignInPage;
import utiity_Neo.Utility;
import pom_Neo.PasswordPage;



public class NeostoxStefDef1 extends Base
{
	
	SignInPage signIn;
	MobileNoPage mob;
	PasswordPage pwd;
	DashboardPage dash;
	
	
	@Given ("^user open the browser$")
	public void openBrowser() throws IOException
	{
		lounchBrowser();
		
	}
	
	@And("^User lounch Neostox portalwith URL \\\"(.*)\\\"$")
	public void lounchNeostox(String url)
	{
		driver.get(url);
		
		
	}
	@When("^User click on sign in button on Homepage of neostox$")
	public void clickOnSignInButtonHomePage()
	{
		signIn=new SignInPage(driver);
		signIn.clickOnSignInButton();
		
	}
	@And("User added mbile number as {string} and click on sign in button")
	public void addMobNumber(String mobNum)
	{
		mob=new MobileNoPage(driver);
		mob.enterMobileNo(mobNum);
		mob.clickOnSignInBittoN();
	}
	
	@And("User added password as {string} and click on sign in button")
	public void addPassword(String pass)
	{
		pwd=new PasswordPage(driver);
		pwd.enterPassword(pass);
		Utility.waiting(1000, driver);
		pwd.clickOnSubmitButton(driver);
		
	}
	
	@Then("^User validate the selected company name as \\\"(.*)\\\" is correct ot not$")
	public void validateCompanyName(String CompName)
	{
		dash=new DashboardPage(driver);
		dash.handlePopUp();
		
		
		Assert.assertEquals(dash.compName(), CompName);
	}
	
	@And("^User click on  logout button$")
	public void cickOnLogOutButton()
	{
		dash.logOut();
		driver.close();
	}

}
