package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement about = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		act.moveToElement(about).perform();
		act.click().perform();
		
		WebElement cont = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		 act.moveToElement(cont).build().perform();
		

	}

}
