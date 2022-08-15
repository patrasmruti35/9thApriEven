package newpr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTION {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dst = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(src, dst).perform();
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		act.clickAndHold(s1).moveToElement(d1).release().build().perform();
		
		  
		  

	}

}
