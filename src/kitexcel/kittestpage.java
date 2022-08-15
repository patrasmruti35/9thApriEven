package kitexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kittestpage {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notification");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 
		 File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		 kitloginpage login= new kitloginpage(driver);
         Thread.sleep(2000);
		 login.sendkeysUserID(UN);
		 login.sendkeysPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		 login.clickonLogin();
		 Thread.sleep(2000);
		 kitpinpage pin=new kitpinpage(driver);
		 
		 pin.sendkeysPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		 pin.ClickonCountiButton();
		  Thread.sleep(2000);
		 kithomepage home=new kithomepage(driver);
		  home.validuserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		  home.clickonLogOutButton();
		  Thread.sleep(2000);
		  driver.close();
				 
			 
				
	
		
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
