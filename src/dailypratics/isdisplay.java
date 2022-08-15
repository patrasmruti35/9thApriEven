package dailypratics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
         
          Thread.sleep(30000);
      WebElement textbox = driver.findElement(By.id("displayed-text"));
      
   WebElement showhide = driver.findElement(By.id("show-textbox"));
   if(textbox.isDisplayed())
   {
	   textbox.sendKeys("WEL COME");
   }
       
       else 
       {
		 showhide.click();
		 textbox.sendKeys("wel come 1");
	}
     
	}

}
