package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.Signuppage;

public class Signup extends Base_Test {
	@Test
	public void signup() throws InterruptedException
	{
		Signuppage sg=new Signuppage(driver);
		sg.signup();
		sg.phonenumb();
		sg.submit();
		sg.firstname();
		Thread.sleep(1000);
		sg.lastname();
		Thread.sleep(1000);
		sg.emailid();
		Thread.sleep(1000);
		sg.createpassword();
		Thread.sleep(1000);
		sg.submita();
		Thread.sleep(9000);
		sg.thanks();
		sg.confirmationmsg();
	}

}
