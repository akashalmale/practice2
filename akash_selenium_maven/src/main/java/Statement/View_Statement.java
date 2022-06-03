package Statement;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_Statement {
	@FindBy(xpath="(//div[@class='ledger-total min-box']//h1)[1]") private WebElement OB;
	
	@FindBy(xpath="(//div[@class='ledger-total min-box']//h1)[2]") private WebElement CB;
	
	public View_Statement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void OpenBalance()
	{
        
		String S1=OB.getText();
		System.out.println(S1);
	}
	public void ClosBalance()
	{
		String S2=CB.getText();
		System.out.println(S2);
	}

}
