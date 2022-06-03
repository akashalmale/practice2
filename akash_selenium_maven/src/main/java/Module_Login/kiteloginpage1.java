package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1 {
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PSD;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	public kiteloginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enteruserid(String ID)
	{
		UN.sendKeys(ID);
	}
	public void enterpsd(String psd)
	{
		PSD.sendKeys(psd);
	}
	public void Login()
	{
		login.click();
	}
	

}
