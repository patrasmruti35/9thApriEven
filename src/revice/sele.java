package revice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://testautomationpractice.blogspot.com/");
         
          Thread.sleep(2000);
          
          WebElement key = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
          key.click();
          key.sendKeys("baby");
          
          driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
          
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[text()='Click Me']")).click();
          
          Alert alt = driver.switchTo().alert();
          Thread.sleep(2000);
          alt.accept();
          
          
       

	}

}
