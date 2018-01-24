package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Signuppage extends Base_Page{

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
	
	@FindBy(xpath="//button[.='Thanks']")
	public WebElement thanks;
	
	@FindBy(xpath="//div[@id='ssu']/h3")
	public WebElement confirmationmsg;
	
	
	public Signuppage(WebDriver driver)
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

	public void firstname()
	{
		firstname.sendKeys("");
	}
    
	public void lastname()

	{
		lastname.sendKeys("");
	}
	
	public void emailid()
	{
		emailid.sendKeys("");
	}
	
	public void createpassword()
	{
		createpassword.sendKeys("");
	}
	
	public void thanks()
	{
		thanks.click();
	}
	
	public void confirmationmsg()
	{
		confirmationmsg.getText().toString().contains("Congratulations");
	}
	
	
}
