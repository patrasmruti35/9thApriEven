package KitUserIdusingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitLoginPage 
{


	
	@FindBy(id="userid") private WebElement userid;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement login;
	
	//2.
	
	public KitLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}
	//3.
	public void senduserID(String UN)
	{
		userid.sendKeys(UN);
	}
	public void sendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonlogin()
	{
		login.click();
	}
}