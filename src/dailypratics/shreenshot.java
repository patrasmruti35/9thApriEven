package dailypratics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class shreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://paytm.com/login");
         
          Thread.sleep(30000);
          
         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String random = RandomString.make(3);

         File dest=new File("C:\\Users\\PATRA\\Videos\\AnyDesk\\AnyDesk"+ random+".png");
         
         FileHandler.copy(src, dest);
	}

}
