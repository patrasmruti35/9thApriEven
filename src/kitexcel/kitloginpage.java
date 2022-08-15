package kitexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitloginpage 
{

	 @FindBy(id="userid") private WebElement userID;
	 @FindBy(id="password")private WebElement password;
	 @FindBy(xpath="//button[@type='submit']") WebElement loginbutton;
	 
	//2. Initialize within a constructor with access level public using pagefactory
	 
	  public kitloginpage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	
	//3. Utilize within a method with access level public
	   public void sendkeysUserID(String UN)
	   {
		   userID.sendKeys(UN);
	   }
	public void sendkeysPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void clickonLogin()
	{
		loginbutton.click();
	}
	
	
	
	
}
