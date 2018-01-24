package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Air_Tickets extends Base_Page{
	@FindBy(id="hotkeys_text_1")
	public WebElement Airtickets;
	
	@FindBy(id="departure")
	public WebElement Leaveingfrom;
	
	@FindBy(id="ui-id-65")
	public WebElement Autosuggestion1;
	
	@FindBy(id="arrival")
	public WebElement Goingto;
	
	@FindBy(id="arrival")
	public WebElement Autosuggestion2;
	
	@FindBy(id="departDate")
	public WebElement Departure;
	
	@FindBy(id="//a[.='24']")
	public WebElement Date;
	
	@FindBy(xpath="(//span[.='+'])[1]")
	public WebElement Adult;
	
	@FindBy(xpath="//input[@class='btn inputbtn hidden-xs']")
	public WebElement Search;


public Air_Tickets(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}
public void Airtickets()
{
	Airtickets.click();
}
public void Leaveingfrom()
{
	Leaveingfrom.sendKeys("bangalore");
	Autosuggestion1.click();
	
}
}