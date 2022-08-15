package Pupup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newil {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.get("https://www.facebook.com/");
	}

}
