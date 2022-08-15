package varifyloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediflogin 
{
 @FindBy(id = "userid")private WebElement uid;
 @FindBy(id = "password")private WebElement pword;
 @FindBy(xpath = "//button[@type='submit']")private WebElement Log;
 
 
 //2.
  public rediflogin(WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }
  //3.
  
  public void Sendkey(String UID)
  {
	  uid.sendKeys(UID);
  }
  public void Sendpwd(String PWD)
  {
	  pword.sendKeys(PWD);
  }
  public void clicklogin()
  {
	  Log.click();
  }
}
