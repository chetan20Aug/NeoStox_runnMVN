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

import Base_Neo.Base;
import POM_Neo.DashboardPage;
import POM_Neo.MobileNoPage;
import POM_Neo.SignInPage;
import POM_Neo.passwordPage;
import Utiity_Neo.Utility;



@Listeners (Listeners_Neo.Listener.class)
public class NewTest extends Base
{
	//ck
	
	SignInPage sign;
	MobileNoPage mobile;
	passwordPage pass;
	DashboardPage dash;
	
	
	
	@BeforeClass
	public void lounchBrowser() throws IOException
	{
		lounchNeoStox();
		Utility.waiting(500, driver);
	    sign=new SignInPage(driver); 
	    mobile=new MobileNoPage(driver);
	    pass=new passwordPage(driver);
	    dash=new DashboardPage(driver);
	}
	
	@BeforeMethod
	public void logIninNeostox() throws IOException
	{
		sign.clickOnSignInButton();
		Utility.waiting(1000, driver);
		mobile.enterMobileNo(Utility.readDataFromPropertyFile("mobileNo"));
		Utility.waiting(1000, driver);
		mobile.clickOnSignInBittoN();
		Utility.waiting(1000, driver);
		pass.enterPassword(Utility.readDataFromPropertyFile("password"));
		Utility.waiting(2000, driver);
		pass.clickOnSubmitButton();
		Utility.waiting(1000, driver);
		dash.handlePopUp();
		Utility.waiting(500, driver);
		//dash.searchComp(Utility.readDataFromPropertyFile("comp"), null);
		
		
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
