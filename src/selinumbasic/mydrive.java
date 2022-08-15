package selinumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mydrive {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		  
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		// driver.close();
		 
		// driver.quit();
		 
		 //driver.manage().window().maximize();
		  // driver.manage().window().minimize();

	}

}
