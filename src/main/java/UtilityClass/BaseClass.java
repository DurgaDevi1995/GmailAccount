package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver gerBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vignesh S.A\\ecli\\GmailDemo\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	
	public static void login(WebElement element, String user) {
		element.sendKeys(user);
	}
	public static void pasword(WebElement element, String password) {
		element.sendKeys(password);
	}
	
	
}
