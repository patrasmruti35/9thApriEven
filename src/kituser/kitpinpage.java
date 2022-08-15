package kituser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitpinpage 


{
	//1. Data member should be declared globally with access level private using @findBy Annotation

	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	 public kitpinpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	//3. Utilize within a method with access level public
	 public void sendpin()
	 {
		 PIN.sendKeys("982278");
	 }
	
	 public void clickoncontinuebutton()
	 {
		 continuebutton.click();
	 }
}
