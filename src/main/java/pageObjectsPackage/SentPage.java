package pageObjectsPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class SentPage {

	LoginPage login = new LoginPage();
	public static WebElement element = null;

	public static void viewSentFolder(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 element = driver.findElement(By.xpath("//div[@class='ajl aib aZ6']"));	
	        js.executeScript("arguments[0].scrollIntoView(true)", element);
		//element = driver.findElement(By.xpath("//input[@name='q']"));
		//element.sendKeys("in:sent");
		//element.sendKeys(Keys.ENTER);
		element = driver.findElement(By.xpath("//a[text()='Sent']"));
		element.click();
	}

	public static void olderLink(WebDriver driver) throws Exception {
		element = driver.findElement(By
				.xpath("//div[@class='nH bkK nn']/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/span/div[3]/img"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.xpath("//div[@id=':16j']"));
		Assert.assertEquals(element.isDisplayed(), "51-60 of 60");
	}

	public static void newerLink(WebDriver driver) throws Exception {
		element = driver.findElement(By
				.xpath("//div[@class='nH bkK nn']/div/div/div/div/div[1]/div[3]/div/div[2]/div[1]/span/div[2]/img']"));
		element.click();
		Thread.sleep(10000);
		element = driver.findElement(By.xpath("//div[@id=':14j']"));
		Assert.assertEquals(element.isDisplayed(), "51-60 of 60");
		Reporter.log("Sentfolder view and muliti is successful", true);
	}

	public static void verifySentFolder(WebDriver driver, String username, String Password) throws Exception {
		LoginPage.fillUserName(driver, username);
		LoginPage.clickNext(driver);
		LoginPage.fillPassword(driver, Password);
		LoginPage.clickNext(driver);
		Thread.sleep(10000);
		LoginPage.verifyLogin(driver);
		//Thread.sleep(10000);
		viewSentFolder(driver);
		Thread.sleep(10000);
		olderLink(driver);
		Thread.sleep(10000);
		newerLink(driver);
		Thread.sleep(10000);
		LoginPage.logOut(driver);
	}

}
