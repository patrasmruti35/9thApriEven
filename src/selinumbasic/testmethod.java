package selinumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testmethod {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     
     driver.findElement(By.id("ap__email")).sendKeys("8249049985");
     
     

	}

}
