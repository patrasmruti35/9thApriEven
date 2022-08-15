package srialyparall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialNewTest2 {
  @Test
  public void lunchpaytm() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
  }
}
