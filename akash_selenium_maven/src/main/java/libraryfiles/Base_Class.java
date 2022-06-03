package libraryfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public WebDriver driver;
	
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\eclipse-workspace\\akash_selenium_maven\\Browser\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}