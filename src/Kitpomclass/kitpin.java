package Kitpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitpin 
{
 @FindBy(id = "pin") private WebElement pin;
 @FindBy(xpath = "//button[@type='submit']")private WebElement cbutton;
 
 //2.
  public kitpin(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public void sendpin(String Pin)
  {
	 pin.sendKeys(Pin); 
  }
  public void clickbutton()
  {
	  cbutton.click();
  }
}
