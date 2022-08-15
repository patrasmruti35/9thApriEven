package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class scrennshotsofsection {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	    WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
//	    Select s1=new Select(listbox);
//	    s1.selectByValue("option2");
	    
	    
	    //TakesScreenshot ts = ((TakesScreenshot)driver);
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	   String randome = RandomString.make(3);
	   File des=new File("C:\\Users\\PATRA\\DesktopNew folder (2)"+randome+".png");
        FileHandler.copy(src, des);
	    

	}

}
