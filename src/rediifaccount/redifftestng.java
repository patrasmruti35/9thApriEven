package rediifaccount;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifftestng {

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
        
        kitlogin log=new kitlogin(driver);
        log.Sendkey(uid);
        log.Sendpwd(pwd);
        log.clicklogin();
        
        kitpin PIN=new kitpin(driver);
        PIN.sendpin(pin);
        PIN.clickbutton();
        
        kithomepage home=new kithomepage(driver);
        home.getActualuserid();
	}

}
