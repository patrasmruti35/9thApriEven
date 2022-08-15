package POMWITHEXCEL;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class kittestclass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		//ChromeOptions opt=new ChromeOptions();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		String uid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
	     
		 
		KitLoginPage login=new KitLoginPage(driver);
		login.senduserID(uid);
		login.sendPassword(pwd);
		login.clickonlogin();
		Thread.sleep(2000);
		kitpinpage Pin=new kitpinpage(driver);
		
		Pin.sendpin(pin);
		Pin.clickoncontinue();
		Thread.sleep(2000);
		kithomepage home=new kithomepage(driver);
		home.Validuserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		home.clickonLogout();
		Thread.sleep(2000);
		driver.close();
		
		 
		
		
		 

	}

}
