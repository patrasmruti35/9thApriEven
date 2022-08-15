package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.discoveryplus.in/");
		  
		  Thread.sleep(15000);
		  driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		  
		  Thread.sleep(15000);
		  
		  WebElement OTPBUTON = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		 
              boolean result = OTPBUTON.isEnabled();
              System.out.println("otp button is"+result);
              
              driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8249049985");
              
              Thread.sleep(15000);
               boolean result1 = OTPBUTON.isEnabled();
               System.out.println("mobile no "+result1);
               
            if (result1) 
            {
				System.out.println();
			} 
            else 
            {
                System.out.println();
			}
               
              
	}
 
}

