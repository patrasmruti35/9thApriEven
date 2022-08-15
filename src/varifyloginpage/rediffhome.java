package varifyloginpage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffhome
{
   @FindBy(xpath = "//span[@class='user-id']")private WebElement Userid;
   @FindBy(xpath = "//a[@target='_self']")private WebElement LOGout;
   
   //2.
   
   public rediffhome(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   //3.
   //public void validid( String expecteduid)
   //{
	//   String actuluserid=Userid.getText();
	//   if(actuluserid.equals(expecteduid))
	//   {
	//	  System.out.println("actualuserid and expecteduid is match so my tc passed"); 
	//   }
	//   else {
	//		  System.out.println("actualuserid and expecteduid is match so my tc failed");
	//   }
//}
   public String getActualuserid()
   {
	  String actualuserid = Userid.getText();
	  return actualuserid;
   }
   
   public void logout()
   {
	   Userid.click();
	   LOGout.click();
	   
   }
   
}
