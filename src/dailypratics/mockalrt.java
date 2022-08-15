package dailypratics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mockalrt {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://courses.letskodeit.com/practice");
         
          Thread.sleep(2000);
          driver.switchTo().frame("courses-iframe");
     driver.findElement(By.xpath("(//h4[@class='dynamic-heading'])[1]")).click();
     
     Thread.sleep(2000);
     driver.switchTo().defaultContent();
     driver.switchTo().frame("courses-iframe");
     
     WebElement list = driver.findElement(By.xpath("//select[@name='categories']"));
     Select s=new Select(list);
     s.selectByVisibleText("Sofware Testing");
     
    
    
	}

}
