package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class kittestclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 
		 KitLoginPage login= new KitLoginPage(driver);
		 
          login.senduserID();
          login.sendpassword();
          login.clickonlogin();
          
          Thread.sleep(2000);
          
          kitpinpage PIN= new kitpinpage(driver);
          PIN.sendpin();
          PIN.Clickoncotinue();
          
          Thread.sleep(2000);
          
          kithomepage HOME= new kithomepage(driver);
          HOME.validuserId();
          HOME.Logout();
          driver.close();
          
	}

}
