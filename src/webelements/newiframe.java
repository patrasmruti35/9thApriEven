package webelements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class newiframe {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	         driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	         
	          Thread.sleep(30000);
	          
	          String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	          System.out.println(text);
	          
	          driver.switchTo().frame("frame1");
	          
	         driver.findElement(By.tagName("input")).click();
	         
	         Thread.sleep(30000);
	         
	         driver.findElement(By.tagName("input")).sendKeys("sai ram");
	         
	         driver.switchTo().frame("frame3");
	         WebElement text2 = driver.findElement(By.id("a"));
	         
	         if(text2.isSelected())
	         {
	        	 System.out.println("check box already selected");
	         }
	         
	         else 
	         {
				text2.click();
				System.out.println("check box slected");
			}
	         driver.switchTo().defaultContent();
	         driver.switchTo().frame("frame2");
	         Thread.sleep(30000);
	          
	         WebElement check = driver.findElement(By.id("animals"));
	         Select s=new Select(check);
	         s.selectByVisibleText("Big Baby Cat");
	          
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       String random=RandomString.make(3);
	       File dest=new File("C:\\Users\\PATRA\\Videos\\AnyDesk\\AnyDesk"+random+".png");
	       FileHandler.copy(src, dest);
	}

}

