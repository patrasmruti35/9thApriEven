package MockTask;

import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='About Us']")).click();
		  
		  Thread.sleep(2000);
		 String idofmain = driver.getWindowHandle();
		  System.out.println(idofmain);
		  
		  Thread.sleep(2000);
		  Set<String> idofall = driver.getWindowHandles();
		  System.out.println(idofall);
		  
		  Thread.sleep(2000);
		  
		  ArrayList al=new ArrayList<>(idofall);
		  System.out.println(al.get(0));
		  
		  driver.close();
	}

}

