package nakuri;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {

  @Test
  public void b() throws InterruptedException 
  {
	  
	  Reporter.log("my b is running",true);
  }
  @Test
  public void c() throws InterruptedException 
  {
	  
	  Reporter.log("my c is running",true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("my d is running",true);
  }
  @Test
  public void a() 
  {
	  Reporter.log("my a is running",true);
  }
}
