package selinumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivestudy {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\9th april\\selenium\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
    
        driver.get("https://www.google.com/search?q=technipfmc+hyderabad&rlz=1C1CHZN_enIN1000IN1000&oq=t&aqs=chrome.0.69i59l2j46i67i199i465j69i57j0i67j69i60l3.7617j0j7&sourceid=chrome&ie=UTF-8");
	
	 //driver.manage().window().maximize();
	// driver.manage().window().minimize();
        
        Thread.sleep(5000);
	 
	 //driver.navigate().to("https://www.google.com/search?q=bhakti+nagar+n1+cidco+aurangabad&rlz=1C1CHZN_enIN1000IN1000&oq=bhakti+nagar+n1+cidco+aurangabad&aqs=chrome..69i57j69i60.42050j0j7&sourceid=chrome&ie=UTF-8");
	
	 //Thread.sleep(5000);
	 
	 //driver.navigate().back();
	 
	 //driver.navigate().refresh();
	 
	 //Thread.sleep(5000);
	 //driver.navigate().forward();
        
        
      String title = driver.getTitle();
      
        System.out.println(title);
        
     String url = driver.getCurrentUrl();
      System.out.println(url);
        
        
      
	 
	}
}
