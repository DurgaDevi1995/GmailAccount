
package pageObjectsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	public static WebElement element = null;

	public static void fillUserName(WebDriver driver, String username) {
		element = driver.findElement(By.name("identifier"));
		element.sendKeys(username);
	}

	public static void clickNext(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
		element.click();
	}

	public static void fillPassword(WebDriver driver, String Password) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		passwordElement.click();
		passwordElement.sendKeys(Password);
	}

	public static void verifyLogin(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[text()='mail.google.com']"));
		element.click();
		Reporter.log("Login with valid credentials is successful", true);
	}

	public static void logOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='gb_D gb_Ta gb_i']/img"));
		element.click();
		element = driver.findElement(By.xpath("//*[text()='Sign out']"));
		element.click();
		Reporter.log("Logout is successful", true);
	}

	public static void loginToGmail(WebDriver driver, String username, String password) {
		fillUserName(driver, username);
		clickNext(driver);
		fillPassword(driver, password);
		clickNext(driver);
		verifyLogin(driver);
		logOut(driver);
	}
}