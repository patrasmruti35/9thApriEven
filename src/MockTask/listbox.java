package MockTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		 Thread.sleep(2000);
		 WebElement list = driver.findElement(By.id("day"));
           Select s1= new Select(list);
           s1.selectByValue("3");
           
           //driver.findElement(By.id("month"))
	}

}
