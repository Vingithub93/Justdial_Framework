package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Loginpage extends Base_Page {
	@FindBy(id="h_login")
	public WebElement login;
	
	@FindBy(id="em")
	public WebElement phonenumb;
	
	@FindBy(id="pass")
    public WebElement password;
	
	@FindBy(id="lgn_smt")
	public WebElement submit;
	
	public Loginpage(WebDriver driver)
	{
    super(driver);
    PageFactory.initElements(driver,this);
}
public void login()
{
	login.click();
}
public void phonenumb()
{
	phonenumb.sendKeys("8553359673");
}

public void password()
{
	password.sendKeys("justdial123");
}

public void submit()
{
	submit.click();
}
}

