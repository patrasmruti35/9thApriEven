package revice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxeg {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(20000);
        
        WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
        
        Select s=new Select(listbox);
        
       // s.selectByIndex(2);
       // s.selectByVisibleText("Option2");
        s.selectByValue("option3");
        

	}

}
