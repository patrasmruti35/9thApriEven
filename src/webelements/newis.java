package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newis {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.discoveryplus.in/");
		  
		  Thread.sleep(20000);
		   driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		   
		   Thread.sleep(20000);
		   
		WebElement otpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean text = otpbutton.isEnabled();
		    System.out.println("otp button enable"+text);
		    
		    Thread.sleep(20000);
		    
		  WebElement mobileno = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		    
		  mobileno.sendKeys("8249049985");
		  Thread.sleep(30000);
		  
		boolean text1 = otpbutton.isEnabled();
		   System.out.println("otp button enable"+text1);
		   
		   if(text1)
		   {
			   otpbutton.click();
			   System.out.println("click on otp button");
		   }
		   else 
		   {
			   mobileno.sendKeys("8249049985");
		   }
	}

}
