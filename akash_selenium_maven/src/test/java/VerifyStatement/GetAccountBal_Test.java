package VerifyStatement;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module_Login.Kitehome;
import Module_Login.kiteloginpage1;
import Module_Login.kiteloginpage2;
import Statement.Dashboard_statement;
import Statement.View_Statement;
import libraryfiles.Base_Class;
import libraryfiles.UtilityClass;

public class GetAccountBal_Test extends Base_Class{
	
	kiteloginpage1 page1;
	kiteloginpage2 page2;
	Kitehome Home;
	Dashboard_statement Dash;
	View_Statement bal;
	
	@BeforeClass
	public void OpenBrowser() {
		initializeBrowser();
		page1=new kiteloginpage1(driver);
		page2=new kiteloginpage2(driver);
		Home=new Kitehome(driver);
		Dash=new Dashboard_statement(driver);
		bal=new View_Statement(driver);
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
	public void Statement()
	{
		Dash.dashboard();
		Dash.statement();
		UtilityClass.ViewStatementPopUp(driver, 1);// child window
		bal.OpenBalance();
		bal.ClosBalance();
		UtilityClass.ViewStatementPopUp(driver, 0);// main window
	}
	@AfterMethod
	public void Logout()   
	{
		Home.User();   
		Home.KiteLogout();   
	}
	@AfterClass
	public void closeBrow() 
	{
		driver.quit(); 
	}
	}
