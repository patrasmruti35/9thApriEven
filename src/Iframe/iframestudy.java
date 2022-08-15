package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class iframestudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	     
	     Thread.sleep(500);
	     
	     driver.switchTo().frame("frame1");
	     Thread.sleep(500);
	     driver.findElement(By.tagName("input")).sendKeys("smruti");
	     Thread.sleep(500);
	     driver.switchTo().frame("frame3");
	     WebElement checkbutton = driver.findElement(By.id("a"));
	     
	     if(checkbutton.isSelected())
	     {
	    	 System.out.println("check box already selected");
	     }
	      
	     else 
	     {
	    	 checkbutton.click();
	    	 System.out.println("click on list box");
	     }

	}

}
