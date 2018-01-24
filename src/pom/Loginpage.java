package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Loginpage extends Base_Page{

	@FindBy(id="h_sin_up")
	public WebElement signup;
	
	@FindBy(id="mobile_srch")
	public WebElement phonenumb;
	
	@FindBy(id="btnSubmit3")
	public WebElement submit;
	
	@FindBy(id="fn")
	public WebElement firstname;
	
	@FindBy(id="ln")
	public WebElement lastname;
	
	@FindBy(id="ei")
	public WebElement emailid;
	
	@FindBy(id="cp")
	public WebElement createpassword;
	
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	 
	public void signup()
	{
		signup.click();
	}
	
	
	public void phonenumb()
	{
		phonenumb.click();
	}
	
	public void submit()
	{
		submit.click();
	}

	{
		firstname.sendKeys("bharanigr");
	}
    
	public void lastname()
	{
		lastname.sendKeys("ramesh");
	}
	
	public void emailid()
	{
		emailid.sendKeys("bharani1@gmail.com");
	}
	
	public void createpassword()
	{
		createpassword.sendKeys("bharani12345");
	}
}
