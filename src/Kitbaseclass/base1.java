package Kitbaseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Kitutility.utility1;

public class base1 
{
	protected WebDriver driver;
 public void openapplication() throws IOException
 {
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
	
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(utility1.datareadfrompropertfile("URL"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 
 }

}
