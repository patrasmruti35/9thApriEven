package TestNgStudy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Testngtest {
  @Test
  public void lunchkit() 
  {

		//System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\9th april\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 
  }
  
}
