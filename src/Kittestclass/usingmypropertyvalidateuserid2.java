package Kittestclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Kitbaseclass.base;
import Kitbaseclass.base1;
import Kitpomclass.kithomepage;
import Kitpomclass.kitlogin;
import Kitpomclass.kitpin;
import Kitutility.utility;
import Kitutility.utility1;



public class usingmypropertyvalidateuserid2 extends base1 {
	kitlogin log;
	kitpin  pin;
	kithomepage home;
	@BeforeClass
	public void lucnchbrowser() throws IOException
	{
		openapplication();
		log = new kitlogin(driver);
		pin = new kitpin(driver);
		home =new kithomepage(driver); 
	}
	@BeforeMethod
	public void logintokitApp() throws EncryptedDocumentException, IOException
	{
		log.Sendkey(utility1.datareadfrompropertfile("UN"));
		log.Sendpwd(utility1.datareadfrompropertfile("PWD"));
		log.clicklogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendpin(utility1.datareadfrompropertfile("PIN"));
		pin.clickbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
  @Test
  public void kitvalidid() throws EncryptedDocumentException, IOException 
  {
	  String TCID="1234";
	 Assert.assertEquals(home.getActualuserid(),utility1.datareadfrompropertfile("UN"),"tc failed actual and expected user id not match ");
	  utility.capture(driver, TCID);
  } 
  @AfterMethod
  public void logout()
  {
	  home.logout();
  }
  public void close()
  {
	  driver.close();
  }
  
}
