package selinumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivernavegator {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
 
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    
     Thread.sleep(5000);
     
     driver.navigate().to("https://www.amazon.in/");
		
     Thread.sleep(5000);
     
     driver.navigate().back();
     
     driver.navigate().refresh();

	}

}
