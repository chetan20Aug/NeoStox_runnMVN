package test_Neo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_Neo.Base;
import pom_Neo.DashboardPage;
import pom_Neo.MobileNoPage;
import pom_Neo.SignInPage;
import pom_Neo.PasswordPage;
import utiity_Neo.Utility;



@Listeners (listeners_Neo.Listener.class)
public class NewTest extends Base
{
	//ck
	
	SignInPage sign;
	MobileNoPage mobile;
	PasswordPage pass;
	DashboardPage dash;
	
	
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		lounchBrowser();
		Utility.waiting(500, driver);
	    sign=new SignInPage(driver); 
	    mobile=new MobileNoPage(driver);
	    pass=new PasswordPage(driver);
	    dash=new DashboardPage(driver);
	    
	   
	
	    
	}
	
	@BeforeMethod
	public void logIninNeostox() throws IOException
	{
		driver.get(Utility.readDataFromPropertyFile("url"));
		Utility.waiting(1000, driver);
		sign.clickOnSignInButton();
		Utility.waiting(1000, driver);
		mobile.enterMobileNo(Utility.readDataFromPropertyFile("mobileNo"));
		Utility.waiting(1000, driver);
		mobile.clickOnSignInBittoN();
		//Utility.waiting(2000, driver);
		pass.enterPassword(Utility.readDataFromPropertyFile("password"));
		Utility.waiting(2000, driver);
		pass.clickOnSubmitButton(driver);
		Utility.waiting(1000, driver);
		dash.handlePopUp();
		Utility.waiting(500, driver);
		
		
		
	}
  @Test
  public void validatecompanylisted() throws IOException 
  {
	 
	Assert.assertEquals(dash.compName(), Utility.readDataFromPropertyFile("comp"));
	  
  }

	
	@AfterMethod
	  public void logOutNeo()
	  { 
		Utility.waiting(1000, driver);
		dash.logOut();
		
	  }


   @AfterClass
  public void closeBrowser()
   {
	driver.close();
   }





}
