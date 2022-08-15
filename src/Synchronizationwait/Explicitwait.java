package Synchronizationwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
	     
		WebElement Radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		 
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(3000));
		 w.until(ExpectedConditions.elementToBeClickable(Radio2));
	}

}
