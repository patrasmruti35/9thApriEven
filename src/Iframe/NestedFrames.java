package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://demoqa.com/nestedframes");
	     
	     Thread.sleep(500);
	     
	     driver.switchTo().frame("frame1").switchTo().frame(0);
	     
	  String text = driver.findElement(By.tagName("p")).getText();
	   System.out.println(text);
	   driver.switchTo().parentFrame();
	   driver.close();
	     
	     

	}

}