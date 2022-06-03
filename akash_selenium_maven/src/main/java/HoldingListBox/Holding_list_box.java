package HoldingListBox;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Holding_list_box {
	@FindBy(xpath="//span[text()='Holdings']") private WebElement Holdings;
	
	@FindBy(xpath="//div[@name='holdings-selector']") private WebElement AllStocks;
	
	@FindBy(xpath="//select") private WebElement dropdown;
	
	public Holding_list_box(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void holding() 
	{
		Holdings.click();
	}
	
	public WebElement Hold_list()
	{  
		return dropdown;
	}

}
