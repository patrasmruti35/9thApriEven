package TestNGPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestcross {
  @Parameters("browser")
  @Test
  public void mymethod(String Bname) 

  {
	  WebDriver driver=null;
	  if(Bname.equals("chrome"))
	{System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
	  driver=new ChromeDriver();}
	  
	  else if (Bname.equals("firebox")) {
		
	
	  System.setProperty("webdriver.geckodriver.driver", "D:\\9th april\\geckodriver.exe");
	  driver=new FirefoxDriver();}
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }
}
