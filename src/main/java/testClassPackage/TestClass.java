
package testClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjectsPackage.LoginPage;
import java.util.concurrent.TimeUnit;

public class TestClass {
	public static WebElement element = null;
	String baseUrl;
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		baseUrl = "https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%26oq%3Dgmail%26aqs%3Dchrome.0.69i59.5719j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh S.A\\ecli\\GmailDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
	public void login(String username, String password)  {
		LoginPage.loginToGmail(driver, username, password);
	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}

