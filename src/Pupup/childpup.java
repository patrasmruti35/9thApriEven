package Pupup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        Thread.sleep(2000);
        
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> idofall = driver.getWindowHandles();
        System.out.println(idofall);
        
        ArrayList<String> al=new ArrayList<>(idofall);
        String mainpage = al.get(0);
        String allpage = al.get(1);
        
        driver.switchTo().window(allpage);
        driver.manage().window().maximize();
        Thread.sleep(1000);
         driver.findElement(By.id("firstName")).click();
         Thread.sleep(1000);
         driver.close();
         driver.switchTo().window(mainpage);
         
         driver.findElement(By.id("name")).click();
         
   
        
         
        
        
	}

}
