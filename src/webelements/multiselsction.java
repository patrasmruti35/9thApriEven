package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselsction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        
        Thread.sleep(20000);
        
       WebElement multiselection = driver.findElement(By.id("cars"));
        Select s=new Select(multiselection);
         System.out.println(s.isMultiple());
         
         s.selectByIndex(0);
         
         Thread.sleep(25000);
         
         s.selectByValue("opel");
         Thread.sleep(20000);
         s.selectByVisibleText("Audi");
         
         Thread.sleep(10000);
         s.deselectByIndex(0);
         
         s.deselectAll();
         
         
	}

}
