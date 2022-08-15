package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listoffindelements {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://vctcpune.com/");
	     List<WebElement> links = driver.findElements(By.tagName("img"));
	      System.out.println(links.size());//how many link
	      // what are the link
	     
              for(WebElement l:links)
              { 
            	  System.out.println(l.getText());
              }
	}

}
