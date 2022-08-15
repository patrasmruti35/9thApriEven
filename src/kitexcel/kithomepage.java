package kitexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kithomepage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement uID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	 public kithomepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void validuserID(String expectedUID)
	 {
		 String actualuserID = uID.getText();
		 if(expectedUID.equals(actualuserID))
		 {
			 System.out.println("actualuserid and expected userid is match test case pass");
		 }
		 else 
		 {
			 System.out.println("actualuserid and expected userid is not match test case failed");
		 }
	 } 
	 public void clickonLogOutButton() throws InterruptedException
	 {
		 uID.click();
		 Thread.sleep(2000);
		 logout.click();
	 }
}