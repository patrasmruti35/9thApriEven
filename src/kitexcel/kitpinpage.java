package kitexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitpinpage
{
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	 public kitpinpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 
	 } 
		 
		//3 
	 
		public void sendkeysPin(String PIN) 
		{
			pin.sendKeys(PIN);
		}
		 
		 public void ClickonCountiButton()
		 {
			 continuebutton.click();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}