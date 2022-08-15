package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeyuse {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  Thread.sleep(2000);
	  
	 // driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("welcome");
	  // Thread.sleep(2000);
	   
	   //driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	    
	   //driver.findElement(By.xpath("//input[@value='Radio3']")).click();

	  String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	   
	    System.out.println(text);
	}

}

