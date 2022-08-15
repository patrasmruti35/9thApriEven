package KitUserIdusingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitpinpage 
{

	@FindBy(id = "pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	//2.
	
	public kitpinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}
	//3.
	public void sendpin(String pin)
	{
		Pin.sendKeys(pin);
	}
	public void clickoncontinue()
	{
		continuebutton.click();
	}
}