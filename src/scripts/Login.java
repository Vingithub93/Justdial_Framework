package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.Loginpage;

public class Login extends Base_Test{
	@Test
	public void login()
	{
		Loginpage lo=new Loginpage(driver);
		lo.login();
		lo.phonenumb();
		lo.password();
		lo.submit();
		
	}

}
