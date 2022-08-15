package Kitbaseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	protected WebDriver driver;
 public void openapplication()
 {
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
	
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 
 }
}
