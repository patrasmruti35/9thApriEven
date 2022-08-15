package revice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newexample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://itera-qa.azurewebsites.net/home/automation");
         
          Thread.sleep(30000);
          
     WebElement text = driver.findElement(By.id("name"));    
      text.click();
      Thread.sleep(2000);
      
      text.sendKeys("ajinkya kale");
      
      WebElement mobileno = driver.findElement(By.id("phone"));
       mobileno.click();
       mobileno.sendKeys("8249049985");
       
       WebElement EMail = driver.findElement(By.id("email"));
       EMail.click();
       EMail.sendKeys("patrasmruti35@gmail.com");
       
       Thread.sleep(2000);
       WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("smrutiajinkya");
       
       Thread.sleep(2000);
       WebElement address= driver.findElement(By.id("address"));
       address.click();
       address.sendKeys("bhakti nagar cidco n1,aurangabad");
       
       Thread.sleep(2000);
       WebElement submit = driver.findElement(By.name("submit"));
       if(submit.isSelected())
       {
    	   System.out.println("subit already selected");
       }
        
        else 
        {
			submit.click();
			System.out.println("click on submit");
		} 

	}

}
