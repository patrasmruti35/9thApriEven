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
import Kitpomclass.kithomepage;
import Kitpomclass.kitlogin;
import Kitpomclass.kitpin;
import Kitutility.utility;



public class validateuserid extends base {
	kitlogin log;
	kitpin  pin;
	kithomepage home;
	@BeforeClass
	public void lucnchbrowser()
	{
		openapplication();
		log = new kitlogin(driver);
		pin = new kitpin(driver);
		home =new kithomepage(driver); 
	}
	@BeforeMethod
	public void logintokitApp() throws EncryptedDocumentException, IOException
	{
		log.Sendkey(utility.readFromExcel(0, 0));
		log.Sendpwd(utility.readFromExcel(0, 1));
		log.clicklogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendpin(utility.readFromExcel(0, 2));
		pin.clickbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
  @Test
  public void kitvalidid() throws EncryptedDocumentException, IOException 
  {
	  String TCID="1234";
	 Assert.assertEquals(home.getActualuserid(),utility.readFromExcel(0, 0),"tc failed actual and expected user id not match ");
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
