package dailypratics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class altpupup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         
          Thread.sleep(30000);
          
          driver.findElement(By.name("q")).sendKeys("oneplus");
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
          
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          

	}

}
