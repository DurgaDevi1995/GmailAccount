
package testClassPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name ="loginData")
	public static Object[][] getLoginData() {
		return new Object[][] { 
			/*{"demosample2020", "abc@1"},
		    {"sample", "testng#1"},
		    {" ", "testng#1"},
		    {"demosample2020",""},*/
		    {"demosample2020","testng#1"}
			};
	}

}


