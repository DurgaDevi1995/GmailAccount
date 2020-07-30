
package pageObjectsPackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;


public class InboxPage {
	LoginPage login = new LoginPage();
	public static WebElement element = null;
	
	
	public static void getmailCount(WebDriver driver) throws Exception {
	   // WebElement mailCount = driver.findElement(By.xpath("//table[@class='F cf zt']/tbody/tr"));
	    List<WebElement> totalmailCount = driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr/td[3]/span/img"));
		System.out.println("Total Number of Mails: "+ totalmailCount.size());
		Reporter.log("Inbox count is successful", true);
		}
	
	public static void verifyMailCount(WebDriver driver, String username, String Password) throws Exception {
		LoginPage.fillUserName(driver, username);
		LoginPage.clickNext(driver);
		LoginPage.fillPassword(driver, Password);
		LoginPage.clickNext(driver);
		LoginPage.verifyLogin(driver);
		Thread.sleep(5000);
		getmailCount(driver);
		Thread.sleep(5000);
		LoginPage.logOut(driver);
	}

}






