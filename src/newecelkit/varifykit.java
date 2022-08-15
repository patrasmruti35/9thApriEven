package newecelkit;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class varifykit {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		File myFile=new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet2");
		String Uid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String Pwd = mysheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		Thread.sleep(2000);
		WebElement USERID = driver.findElement(By.id("userid"));
		WebElement PASSWARD = driver.findElement(By.id("password"));
		WebElement LOGIN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		USERID.sendKeys(Uid);
		PASSWARD.sendKeys(Pwd);
		LOGIN.click();
		
		Thread.sleep(2000);
		WebElement PIN = driver.findElement(By.id("pin"));
       WebElement CONTINUE = driver.findElement(By.xpath("//button[@type='submit']"));
       
       PIN.sendKeys(Pin);
       CONTINUE.click();
       Thread.sleep(2000);
      WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
      
      String expecteduserid="ELR321";
      String actualuserid=UID.getText();
      if(expecteduserid.equals(actualuserid))
      {
    	  System.out.println("Actual and expected userid if");
      }
       Thread.sleep(2000);
       UID.click();
       
      WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
      logout.click();
      driver.close();

	}

}
