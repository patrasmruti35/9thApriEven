package scroling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingbyusingsendkey {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(2000);
       
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView",textbox);
		textbox.sendKeys("wel come");
		Thread.sleep(2000);
		
		WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio2']"));
		//JavascriptExecutor js1= (JavascriptExecutor)driver;
		//Thread.sleep(2000);
		//js1.executeScript("arguments[0].srollIntoView",RadioButton);
		RadioButton.click();
		
	}

}
