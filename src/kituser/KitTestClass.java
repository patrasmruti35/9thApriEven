package kituser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 
		 kitloginpage login=new kitloginpage(driver);
		 login.sendUserID();
		 login.sendPassword();
		 login.clickonLoginbutton();
		 Thread.sleep(2000);
		 kitpinpage pin=new kitpinpage(driver);
		  pin.sendpin();
		  pin.clickoncontinuebutton();
		  Thread.sleep(2000);
		  kithomepage home=new kithomepage(driver);
		   home.validUserId();
		   home.logout();
		   Thread.sleep(2000);
		   
		   driver.close();
		   
		   
		 

	}

}
