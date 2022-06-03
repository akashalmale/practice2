package Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_statement {
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement dashboard;
	
	@FindBy(xpath="//span[text()='View statement']") private WebElement viewStatement;
	
	public Dashboard_statement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dashboard()
	{
		dashboard.click();
		
	}
	 public void statement()
	 {
		 viewStatement.click();
	 }
	
	
	
	

}
