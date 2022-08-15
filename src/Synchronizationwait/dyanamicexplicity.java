package Synchronizationwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dyanamicexplicity {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 WebElement Radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		  Radio2.click();
		 
		   WebElement textbox = driver.findElement(By.id("autocomplete"));
		   textbox.sendKeys("hi");
		   
		  WebElement checkbox = driver.findElement(By.id("dropdown-class-example"));
		   Select s=new Select(checkbox);
		   s.selectByVisibleText("Option2");
		   
		   driver.findElement(By.id("checkBoxOption2")).click();
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
