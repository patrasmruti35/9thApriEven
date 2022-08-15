package newpr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sdndkey {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		
		Actions al=new Actions(driver);
		
		WebElement day = driver.findElement(By.id("day"));
		 al.click(day).perform();
		 
		
		 Thread.sleep(2000);
		 
	for(int i=1;i<=4;i++) 
	{
		
		al.sendKeys(Keys.ARROW_UP).perform();
	}
		 Thread.sleep(2000);
		 al.sendKeys(Keys.ENTER).perform();
	    
		 
		 WebElement month = driver.findElement(By.id("month"));
		  al.click(month).perform();
		  
		Thread.sleep(2000);
		 
		 for(int i=1;i<=5;i++)
		 {
			 al.sendKeys(Keys.ARROW_DOWN).perform();
		 }
		 
		 al.sendKeys(Keys.ENTER).perform();
		 
		WebElement year = driver.findElement(By.id("year"));
		al.click(year).perform();
		
		 for(int i=1;i<=5;i++)
		 {
			 al.sendKeys(Keys.ARROW_DOWN).perform();
		 }
		 
		 al.sendKeys(Keys.ENTER).perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	    
	     
	   
		
	     
		
	}

}
