package KiteHomeTest;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HoldingListBox.Holding_list_box;
import Module_Login.Kitehome;
import Module_Login.kiteloginpage1;
import Module_Login.kiteloginpage2;
import libraryfiles.Base_Class;
import libraryfiles.UtilityClass;

public class Fail_Test_HoldingList  extends Base_Class 
{
	kiteloginpage1 page1;
	kiteloginpage2 page2;
	Kitehome Home;
	Holding_list_box list;
	
	@BeforeClass
	public void OpenBrowser() {
		initializeBrowser();
		page1=new kiteloginpage1(driver);
		page2=new kiteloginpage2(driver);
		Home=new Kitehome(driver);
		list=new Holding_list_box(driver);
		
	}
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException {
		page1.Enteruserid(UtilityClass.GetData("UN"));
		page1.enterpsd(UtilityClass.GetData("PSW"));
		page1.Login();
		
		page2.enterpin(UtilityClass.GetData("PIN"));
		page2.Continue();
		Thread.sleep(2000);
     }
	@Test
	public void HoldingList()
	{
		list.holding();
		UtilityClass.Fail_list(list.Hold_list());
	}
	@AfterMethod
	public void Logout(ITestResult Result) throws IOException   
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.screenshot(driver);
		}
		Home.User();   
		Home.KiteLogout();   
	}
	@AfterClass
	public void closeBrow() 
	{
		driver.quit(); 
	}


}
