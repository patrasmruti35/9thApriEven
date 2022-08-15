package kit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		 UserId.sendKeys("ELR321");
		 Password.sendKeys("Dhana1111");
		 Submit.click();
		 Thread.sleep(2000);
		 WebElement Pin = driver.findElement(By.id("pin"));
		 WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		 Pin.sendKeys("982278");
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
