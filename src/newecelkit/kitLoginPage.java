package newecelkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitLoginPage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		Thread.sleep(2000);
		WebElement USERID = driver.findElement(By.id("userid"));
		WebElement PASSWARD = driver.findElement(By.id("password"));
		WebElement LOGIN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		USERID.sendKeys("ELR321");
		PASSWARD.sendKeys("Dhana1111");
		LOGIN.click();
		
		Thread.sleep(2000);
		WebElement PIN = driver.findElement(By.id("pin"));
       WebElement CONTINUE = driver.findElement(By.xpath("//button[@type='submit']"));
       
       PIN.sendKeys("982278");
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
       
       
       
       
       
       
       

	}

}
