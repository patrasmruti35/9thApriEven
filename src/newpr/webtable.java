package newpr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);

		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println(row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
          System.out.println(column.size());
		
		for(WebElement l:row)
		{
			System.out.println(l.getText());
		}
		
		
		
		
		
		
	}

}
