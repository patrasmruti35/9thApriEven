package KitUserIdusingTestNg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kithomepage 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	
	public kithomepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
}
	//3.
	//public void Validuserid(String expectedUserId)
	//{
		
	//	String actualuserid= UID.getText();
		
	//	if(actualuserid.equals(expectedUserId))
	//	{
	//		System.out.println("actualuserid and expected userid machting tc passed");
	//	}
	//	else {
	//		System.out.println("actualuserid and expected userid machting tc passed");
	//	}
	//}
	
	public String getactualuserid()
	{
		String actualuserID=UID.getText();
		
		return actualuserID;
	}
	
	
	
	public void clickonLogout() throws InterruptedException
	{
		UID.click();
		Thread.sleep(2000);
		logout.click();
		
	}
	
}