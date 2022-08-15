package srialyparall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class paraNewTest1 {
  @Test
  public void luchfbb() {
	  {
		  //System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		  //WebDriver driver=new ChromeDriver();
		  
		  
		  System.setProperty("webdriver.geckodriver.driver", "D:\\9th april\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
	  }
	  
  }
}
