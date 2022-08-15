package screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenstudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
         
          Thread.sleep(1000);
          WebElement Radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
             Radio2.click();
             
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           String random = RandomString.make(3);
            File dest=new File("C:\\Users\\PATRA\\Videos\\AnyDesk\\AnyDesk"+random+".png");
             FileHandler.copy(src, dest);
            
	}
	

}
