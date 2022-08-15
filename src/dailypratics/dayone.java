package dailypratics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dayone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         
          Thread.sleep(30000);
         
         
         driver.navigate().to("https://paytm.com/");
         
         Thread.sleep(30000);
         driver.navigate().back();
         Thread.sleep(30000);
         
         driver.navigate().forward();
         
         driver.navigate().refresh();
          Thread.sleep(30000);
        String titel = driver.getTitle();
         
         System.out.println(titel);
         
       
         

	}

}
