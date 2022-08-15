package dailypratics;

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

public class tryifram {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
         
          Thread.sleep(30000);
      WebElement text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
      String text1 = text.getText();
      System.out.println(text1);
       Thread.sleep(30000);
       
       driver.switchTo().frame("frame1");
       WebElement textbox = driver.findElement(By.tagName("input"));
        textbox.click();
        textbox.sendKeys("sai ram");
        
        Thread.sleep(30000);
        driver.switchTo().frame("frame3");
        WebElement listbox = driver.findElement(By.id("a"));
        if(listbox.isSelected())
        {
        	System.out.println("list box already selected");
        }
        
        else 
        {
			listbox.click();
			System.out.println("click on listbox");
		}
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        Thread.sleep(30000);
        
        WebElement drop = driver.findElement(By.id("animals"));
         Select s= new Select(drop);
         s.selectByVisibleText("Baby Cat");
         
         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String random=RandomString.make(3);
         File dst= new File("C:\\Users\\PATRA\\Videos\\AnyDesk\\AnyDesk"+random+".png");
         FileHandler.copy(src, dst);
	}

}
