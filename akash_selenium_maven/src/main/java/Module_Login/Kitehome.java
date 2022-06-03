package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehome {
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[text()=' Logout']") private WebElement KLogout;
	
	public Kitehome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void User()
	{
		UserID.click();
	}
	public void KiteLogout() {
		KLogout.click();
		
	}
	

}
