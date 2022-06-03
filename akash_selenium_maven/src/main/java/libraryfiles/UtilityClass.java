package libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	public  static String GetData(String key) throws IOException {
		 FileInputStream file=new FileInputStream("C:\\Users\\Vijay\\eclipse-workspace\\akash_selenium_maven\\Propertyfile.properties");
				 Properties prop=new Properties();
				 prop.load(file);
				 String value=prop.getProperty(key);
				 return value;
			}
			public static void ViewStatementPopUp(WebDriver driver, int index)
			{
		        Set<String> IDs=driver.getWindowHandles();
				ArrayList<String> Al=new ArrayList<String>(IDs);
				String Ind=Al.get(index);
				driver.switchTo().window(Ind);
			}
			public static void list(WebElement month)
			{
				Select S=new Select(month);
				S.selectByVisibleText("Mutual funds");
				System.out.println(S.getFirstSelectedOption().getText());
			}
			public static void Fail_list(WebElement month)
			{
				Select S=new Select(month);
				S.selectByVisibleText("Mutual Funds");
				String text=S.getFirstSelectedOption().getText();
				System.out.println(text);
			}
			
			public static void screenshot(WebDriver driver) throws IOException
			{
				File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File Dest=new File("E:\\akash\\Testing\\screenshot\\Kite List.jpg");
				FileHandler.copy(Source, Dest);
			}
}
