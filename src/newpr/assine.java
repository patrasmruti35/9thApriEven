package newpr;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assine {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Start Selenium ')])[1]")).click();
		Thread.sleep(2000);
		
		  Set<String> idofall = driver.getWindowHandles();
		 System.out.println(idofall);
		 
		 ArrayList<String>al=new ArrayList<>(idofall);
		 String main = al.get(0);
		 String chil = al.get(1);
		 
		 driver.switchTo().window(chil);
		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("kamina");
		
		 //driver.close();
		 
		 driver.switchTo().window(main);
		 
		WebElement text = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		 text.click();
		  
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
