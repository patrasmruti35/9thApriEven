package newpr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\9th april\\\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		Thread.sleep(4000);
		WebElement source= driver.findElement(By.xpath("//a[text()=' 5000']"));
		 
		 WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		  act.dragAndDrop(source, dest).perform();
		 
		
        
		
		 
	}

}
