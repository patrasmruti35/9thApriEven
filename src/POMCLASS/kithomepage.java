package POMCLASS;

import java.sql.Driver;

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
	public void validuserId() throws InterruptedException
	{		String expecteduserid="ELR321";
		String actualuserid=UID.getText();
		if(expecteduserid.equals(actualuserid))
		{
			System.out.println("actual and expected maching my tc passed");
		}
		else 
		{
			System.out.println("actual and expected not maching my tc failed");
		}
		
	}	
		
	public void Logout() throws InterruptedException
	{
		UID.click();
		Thread.sleep(2000);
		logout.click();
	}
	
		
	
}
