package Listeners_Neo;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base_Neo.Base;
import Utiity_Neo.Utility;

public class Listener extends Base implements ITestListener
{
	//ck
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+"is Passed", true);
		
		try {
			Utility.screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+"is failed", true);
		try {
			Utility.screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC "+result.getName()+"is skipped", true);
		
		try {
			Utility.screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
