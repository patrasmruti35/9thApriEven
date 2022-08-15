package new1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestng {
	WebDriver driver;
	File myfile;
	 Sheet mysheet;
	KitLoginPage log;
	kitpinpage pin;
	kithomepage home;
	@BeforeClass
	public void lunch() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://kite.zerodha.com/");
	      myfile = new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		  mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		  log=new KitLoginPage(driver);
		  pin=new kitpinpage(driver);
		  home= new kithomepage(driver);
	}
	@BeforeMethod
	public void login()
	{
		log.senduserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		log.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickoncontinue();
	}
  @Test
  public void validid() 
  
  {
	   String expecteduserid=mysheet.getRow(0).getCell(0).getStringCellValue();
	  String actualuserid = home.getactualid();
	  Assert.assertEquals(actualuserid, expecteduserid);
	  
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.clickonLogout();
	  
  }
  @AfterClass
  public void close()
  {
	  driver.close();
  }
}
