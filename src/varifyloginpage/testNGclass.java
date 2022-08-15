package varifyloginpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGclass {
	WebDriver driver;
	File myfile;
	Sheet mysheet;
	rediflogin login;
	rediffpin  pin;
	rediffhome home;
	@BeforeClass
	public void lunch() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("luching kit app",true);
		 myfile=new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		 login=new rediflogin(driver);
		 pin=new rediffpin(driver);
		 home=new rediffhome(driver);
	}
	
	@BeforeMethod
	public void loginid()
	{
		login.Sendkey(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering userid",true);
		login.Sendpwd(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering passward",true);
		login.clicklogin();
		Reporter.log("clickonlogin",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Entering pin",true);
		pin.clickbutton();
		Reporter.log("clickon countinue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
  @Test
  public void validuserid() 
  {
	 String expecteduserid = mysheet.getRow(0).getCell(0).getStringCellValue();
	 
	 String actualuserid = home.getActualuserid();
	 
	 Assert.assertEquals(actualuserid, expecteduserid, "tc failed if actual and expected tc case not match");
	 Reporter.log("validuserid expectedid and actualid",true);
	  
  }
  @AfterMethod
  public void logout()
  {
	  home.logout();
	  Reporter.log("click on logout",true);
  }
  
  @AfterClass
  public void close()
  {
	  driver.close();
	  Reporter.log("close",true);
  }
}
