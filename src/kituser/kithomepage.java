package kituser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kithomepage 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	 public kithomepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	
	//3. Utilize within a method with access level public
	 
	 public void validUserId()
	 {
		 String expecteduserID = "ELR321";
		String actualuserID = UID.getText();
		if(expecteduserID.equals(actualuserID)) 
		{
			System.out.println("Actual and Expect are macthed the testcase are pass");
		}
				 
		else 
		{
			System.out.println("Actual and Expect are not macthed the testcase are failed");
		}
		
	 }
	 
	 
	 
	 
   public void logout() throws InterruptedException
   {
	   UID.click();
	   Thread.sleep(2000);
	   logout.click();
   }
	
	
	 
	
}
