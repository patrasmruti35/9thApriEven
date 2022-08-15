package newpr;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rep {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
         Thread.sleep(2000);
         String idofmain = driver.getWindowHandle();
         System.out.println(idofmain);
         
         Thread.sleep(2000);
        Set<String> idofall = driver.getWindowHandles();
         System.out.println(idofall);
         Thread.sleep(2000);
          ArrayList<String> al= new ArrayList<>(idofall);
           String newmain = al.get(0);
          String child = al.get(1);
          
          driver.switchTo().window(child);
          driver.manage().window().maximize();
          
         // driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("selenium");
         // Thread.sleep(2000);
          //driver.quit();
          
          driver.switchTo().window(newmain) ;
        WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Click below to open ')]"));
         System.out.println(text);
         
         

		
		
		
	}

}
