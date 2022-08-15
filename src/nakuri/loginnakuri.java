package nakuri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginnakuri 
{
  @FindBy(id = "usernameField")private WebElement uid;
  @FindBy(id = "passwordField")private WebElement pwd;
  @FindBy(xpath = "//button[text()='Login']")private WebElement log;
  
  
  //2.
  public loginnakuri(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  } 
  //3.
  public void userid(String UID)
  {
	  uid.sendKeys(UID);
  }
  public void password(String PWD)
  {
	  pwd.sendKeys(PWD);
  }
  public void clicklogin()
  {
	  log.click();
  }
}
