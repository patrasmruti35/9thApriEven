package dailypratics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alartnew {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
         
          Thread.sleep(30000);
          
          driver.findElement(By.id("confirmBox")).click();
          
         Alert alt = driver.switchTo().alert();
        
         System.out.println(alt.getText());
         
         alt.sendKeys("janu i love u");

	}

}
