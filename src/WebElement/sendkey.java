package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sendkey {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("smruti paragyan");
	     
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patra");
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8249049985");
	     Thread.sleep(500);
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("smruti123");
	     Thread.sleep(500);
	   WebElement Day = driver.findElement(By.id("day"));
	   Select s= new Select(Day);
	   s.selectByValue("6");
	   Thread.sleep(500);
	  WebElement Month = driver.findElement(By.id("month"));
	  Select s1=new Select(Month);
	   for(int i=1;i<=10;i++) 
	   {
		   s1.selectByIndex(i);
	   }

	   WebElement Year = driver.findElement(By.id("year"));
	   Select s2=new Select(Year);
	   for(int i=1;i<=12;i++)
	   {
		   s2.selectByIndex(i);
		   
	   }
	   for(int i=7;i>=0;i--)
	   {
		   s2.selectByIndex(i);
	   }
	  Thread.sleep(3000);
	  WebElement radio = driver.findElement(By.id("//input[contains(@id,'u_2_4')]"));
	  if(radio.isSelected())
	  {
		  System.out.println("radio buttonalready selected");
	  }
	  else
	  {
		 radio.click();
		 System.out.println("click on radio button");
	  }
	}

}
