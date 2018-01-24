package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	public	WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty(Auto_constant.GECKO_KEY, Auto_constant.GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.justdial.com/");
		
	}
	@AfterMethod
	public void closeapplicayion()
	{
		driver.close();
	}

}
