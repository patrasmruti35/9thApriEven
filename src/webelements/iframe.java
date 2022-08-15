package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
          driver.switchTo().frame("courses-iframe");
         
         Thread.sleep(30000);
      driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
      
      driver.switchTo().defaultContent();
      
      driver.findElement(By.xpath("//input[@list='mah-district']")).click();
	}

}
