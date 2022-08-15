package varificationintestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnullandnotnull {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.facebook.com/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			String getText = driver.findElement(By.id("email")).getText();
			Assert.assertNull(getText);
  }
}
