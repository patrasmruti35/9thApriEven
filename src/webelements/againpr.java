package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class againpr {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.discoveryplus.in/");
	    
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	    
	    Thread.sleep(30000);
	   WebElement otpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	     
            boolean test = otpbutton.isEnabled();
            System.out.println("otp button is enable"+test);
            
            Thread.sleep(30000);
           WebElement mobileno = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
            mobileno.sendKeys("8249049985");
            
            Thread.sleep(30000);
            boolean test1 = otpbutton.isEnabled();
            System.out.println("otp button is enable "+test1);
            
            if(test1)
            {
            	otpbutton.click();
            	System.out.println("click on otp");
            }
           else {
        	   mobileno.sendKeys("8249049985");
		} 
	}

}
