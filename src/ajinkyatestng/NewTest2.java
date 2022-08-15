package ajinkyatestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://www.discoveryplus.in/");
  }
}
