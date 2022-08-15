package selinumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
	
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://vctcpune.com/");

	}

}
