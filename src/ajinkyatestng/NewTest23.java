package ajinkyatestng;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest23 {
	
  @Test
  public void a() throws InterruptedException 
  {
	  
	  
Reporter.log("a runninr",true);  }
  @Test
  public void b() throws InterruptedException 
  {
	
	  Reporter.log("a runninr",true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("a runninr",true);
  }
}
