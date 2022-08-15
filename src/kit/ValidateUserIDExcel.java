package kit;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIDExcel {


	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		File myFile=new File("D:\\9th april\\New Microsoft Excel Worksheet..xlsx");
		Thread.sleep(2000);
		Sheet Mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		String UID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).createCell(2).getStringCellValue();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		 UserId.sendKeys(UID);
		 Password.sendKeys(PWD);
		 Submit.click();
		 Thread.sleep(2000);
		 WebElement Pin = driver.findElement(By.id("pin"));
		 WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		 Pin.sendKeys(PIN);
		 Continue.click();
		 Thread.sleep(2000);
		 WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));
		  String expectedUserID = "ELR321";
		   String actualUserID = Uid.getText();

		   if(expectedUserID.equals(actualUserID))
		   {
			   System.out.println("Actual and Expected UserID are matching TC pass");
		   }
		   else 
		   {
			   System.out.println("Actual and Expected UserID are Not matching TC fail");
		}
		   Uid.click();
		  WebElement Logout = driver.findElement(By.xpath("//a[@target='_self']"));
		   Logout.click();
		   driver.close();
}
}