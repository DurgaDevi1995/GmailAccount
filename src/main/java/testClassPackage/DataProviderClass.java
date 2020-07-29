
package testClassPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name ="loginData")
	public static Object[][] getLoginData() {
		return new Object[][] { 
			{"demosample2020@gmail.com", "testng#1"},
//			{"wrongusername", "pass1"},
//			{"Ramesh", "wrongpassword"}
			};
	}

}


