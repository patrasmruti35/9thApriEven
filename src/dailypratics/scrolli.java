package dailypratics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolli {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/");
        Thread.sleep(200);
        
        //type cast
        
              JavascriptExecutor js= (JavascriptExecutor)driver;
              js.executeScript("window.scrollBy(0,800)");
              Thread.sleep(200);
              js.executeScript("window.scrollBy(0,-500)");

	}

}
