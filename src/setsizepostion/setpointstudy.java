package setsizepostion;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setpointstudy {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\9th april\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);

		 System.out.println(driver.manage().window().getPosition());
		 
		 
		 //1.create object of point class and pass x and y value
		 Point p=new Point(10, 80);
		 //2.call set position method and pass the object of point class
		 driver.manage().window().setPosition(p);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
