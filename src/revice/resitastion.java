package revice;

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

public class resitastion {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("http://demo.automationtesting.in/Register.html");
         
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("smruti patra");
          
          driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("pragyan");
          
          driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("bhakti nagar cidco aurangabad");
          
          driver.findElement(By.xpath("//input[@type='email']")).sendKeys("patrasmruti35@gmail.com");
          
          driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8249049985");
          WebElement femal = driver.findElement(By.xpath("//input[@value='FeMale']"));
          System.out.println(femal.isSelected());
          femal.click();
          System.out.println(femal.isSelected());
          
         WebElement year = driver.findElement(By.id("yearbox"));
          Select s=new Select(year);
          for(int i=0;i<=12;i++)
          {
        	  s.selectByIndex(i);
          }
          
          Thread.sleep(2000);
         WebElement listmonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
         Select s1=new Select(listmonth);
         s1.selectByValue("December");
         
         Thread.sleep(2000);
         WebElement day = driver.findElement(By.id("daybox"));
          Select s2=new Select(day);
          s2.selectByValue("29");
          
         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String random=RandomString.make();
         File dest= new File("C:\\Users\\PATRA\\Desktop\\New folder\\New folder"+random+".png");
          FileHandler.copy(src, dest);

         
          
          
          
          
          
          
          
	}

}
