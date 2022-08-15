package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alartpopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://demoqa.com/alerts");
         
          Thread.sleep(30000);
          driver.findElement(By.id("alertButton")).click();
          Alert alt = driver.switchTo().alert();
        System.out.println ( alt.getText());
         
        alt.accept();
        
        driver.findElement(By.xpath("(//span[@class='pr-1'])[1]")).click();
        
           

	}

}
