package KitUserIdusingTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validkittestngclass {
	WebDriver driver;
	File myFile;
	Sheet mysheet;
	KitLoginPage login;
	kitpinpage  pin;
	kithomepage home;
	
	@BeforeClass
	public void lunchkitapp() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		 myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		 mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		 login=new KitLoginPage(driver);
		 pin= new kitpinpage(driver);
		 home= new kithomepage(driver);
	}
	
	@BeforeMethod
	public void loginkite()
	
	{
		login.senduserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickonlogin();
		Reporter.log("click on login",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickoncontinue();
		Reporter.log("click on password",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		
		
	}
  @Test
  public void validuserid() 
  {
	String expecteduserid = mysheet.getRow(0).getCell(2).getStringCellValue();
	String actualuserid = home.getactualuserid();
	Assert.assertEquals(actualuserid, expecteduserid+"tc case pass");
	Reporter.log("actual and expected",true);
  }
   @AfterMethod
   public void logout() throws InterruptedException
   {
	   home.clickonLogout();
		Reporter.log("click on logout",true);
	   Thread.sleep(2000);
   }
   @AfterClass
   public void close()
   {
	   driver.close();
		Reporter.log("close",true);
   }

}
 