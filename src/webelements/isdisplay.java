package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {

	public static void main(String[] args) throws InterruptedException 
	{
 System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
     
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://vctcpune.com/selenium/practice.html");
         
         Thread.sleep(30000);
         WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
           
         if( checkbox.isSelected())
         {
        	 System.out.println("check already seleted");
         }
 
        else {
			 checkbox.click();
			 System.out.println("check selected now");
		}
	}

}
