package crossbrozwertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTesttry {
  @Parameters("browzername")
  @Test
  public void mylunch(String bname) 
  {
	  WebDriver driver=null;
	  if(bname.equals("chrome"))
	  {System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");		
	   driver= new ChromeDriver();}
     else if (bname.equals("firefox")) {
		
		  System.setProperty("webdriver.gecko.driver", "D:\\9th april\\geckodriver.exe");
			 driver=new FirefoxDriver();}

				driver.manage().window().maximize();
				 driver.get("https://kite.zerodha.com/");
  }
}
