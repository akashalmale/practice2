package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage2 {
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement ctnbtn;
	
	public kiteloginpage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	public void Continue()
	{
		ctnbtn.click();
	}

}
