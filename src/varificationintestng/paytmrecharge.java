package varificationintestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class paytmrecharge {
  @Test
  public void paytmlunch() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://paytm.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		 driver.findElement(By.xpath("//div[text()='Prepaid']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		 
		 boolean PrepaidButton = driver.findElement(By.xpath("//input[@value='prepaid']")).isSelected();
		 
		  Assert.assertTrue(PrepaidButton);
		 
		 
		 
		 
}
  }